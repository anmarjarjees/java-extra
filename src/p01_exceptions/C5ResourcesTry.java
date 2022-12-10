package p01_exceptions;

/* 
 * Working with files requires the "File" class
 * from java.io package
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/* 
 * Below we added the declaration => throws IOException
 */
public class C5ResourcesTry {
    public static void main(String[] args) {
        /*
         * In Java when we use resources, we follow these steps (milestones)
         * 1. Open a resource
         * 2. Read data from that resource
         * 3. Close the resource
         * 
         * Exception can also happened when we don't close the open resource(s) properly
         * These resources should be always closed after finishing with them
         * there are two solutions to close them.
         * 
         * Two Solutions:
         * **************
         * 1. Close the resources inside the finally {...} block
         * 2. Using Try with resources (recommended) => try-with-resources
         * we can declare the resources that we need to use within the try block
         * and Java will automatically close them for us immediately
         * after the try block execution
         */
        File myInputFile = new File("temp-files/numbers.txt"); // for reading
        File myOutputFile = new File("temp-files/result.txt"); // for writing

        // Example of declaring and initializing recourses:
        try (
                // We can add more than one resource to be closed, each ends with ;
                // notice the ; for the last resource statement is optional
                // also the resources have to be created/declared and initialized within try()
                Scanner scReadFile = new Scanner(myInputFile);
                PrintWriter pwWriteFile = new PrintWriter(myOutputFile)
        /*
         * These resources will be closed in the reverse order that they were defined:
         * Java will close "pwWriteFile" first, then "scReadFile" later
         */) {
            while (scReadFile.hasNext()) {
                // We can output the number to the terminal:
                System.out.println(scReadFile.nextInt());
                // Or saving/writing them to the file:
                pwWriteFile.println(scReadFile);
            }

        } catch (IOException e) {
            System.out.print("Uncompleted operation: " + e.getMessage());
        } // catch
        /*
         * NOTE:
         * try-with-closing resources works with
         * - Classes that implement "Closeable" interface
         * - Classes that implement "AutoCloseable" interface
         * 
         * Examples:
         * - "Scanner" class implements Closeable
         * public final class Scanner implements Iterator<String>, Closeable {...}
         * - "PrintWriter" class extends "Writer" class
         * which implements "Closeable" interface
         * 
         * public class PrintWriter extends Writer {...}
         * public abstract class Writer implements Appendable, Closeable, Flushable
         * {...}
         */

        // The code below will not work as it belongs to solution#1:
        /*
         * finally {
         * scReadFile.close();
         * pwWriteFile.close();
         * }
         */
    } // main()
} // class file
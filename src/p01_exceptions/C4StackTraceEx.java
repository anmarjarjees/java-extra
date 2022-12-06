package p01_exceptions;

/* 
 * Working with files requires the "File" class
 * from java.io package
 */
import java.io.File;
import java.io.IOException;

/* 
 * Below we added the declaration => throws IOException
 */
public class C4StackTraceEx {
    public static void main(String[] args) {
        /*
         * Stack Trace:
         * Interactive log of methods calls which is a history of all method calls
         * within the program's execution that led up to throw exception(s).
         * 
         * This allows us as programmers to trace the path (thread) that the program
         * has used to run our task(s).
         * It can show us the lines that contains the wrong code.
         * 
         * It's commonly used with exception to print the stack trace within the catch
         * lock
         * 
         */
        File myFile = new File("data/any.txt");

        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.print("Uncompleted operation: " + e.getMessage());
            // Without e.printStackTrace:
            // => Uncompleted operation: The system cannot find the path specified

            // With e.printStackTrace:
            e.printStackTrace();
            /*
             * Uncompleted operation:
             * [The system cannot find the path specified java.io.IOException:
             * The system cannot find the path specified] => (4)
             * at java.base/java.io.WinNTFileSystem.createFileExclusively(Native Method) =>
             * (3)
             * at java.base/java.io.File.createNewFile(File.java:1043) => (2)
             * at p01_exceptions.C4StackTraceEx.main(C4StackTraceEx.java:31) => (1)
             * 
             * Explanations:
             * (1) where the code that causes exception begins
             * (2) in java File class => return fs.createFileExclusively(path);
             * (3) no line number. native method was called.
             * It's a method that was NOT written in Java => we cannot access it from Stack
             * Trace
             * (4) The exception class and the message
             */
        } // catch
    } // main()
} // class file
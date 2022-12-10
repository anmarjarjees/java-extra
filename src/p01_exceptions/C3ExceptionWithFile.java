package p01_exceptions;

/* 
 * Working with files requires the "File" class
 * from java.io package
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* 
 * Below we added the declaration => throws IOException
 */
public class C3ExceptionWithFile {
    public static void main(String[] args) throws IOException {
        /*
         * Creating a file with a wrong path
         * Notice that we don't have a folder named "data"
         * 
         * if we remove the folder name "data"
         * and just keep the file name "any.txt"
         * Java will simply created on the room folder
         * 
         * In the code below, we are just creating an object
         * with specifying the parameters
         */
        File myFile = new File("data/any.txt");
        /*
         * Using the File method "createNewFile()"
         * This method will create a new file
         * if the path is correct or exists
         * 
         * NOTE:
         * Java will show a compilation error:
         * Unhandled exception type IOException
         * 
         * Java reminds us that this statement will generate
         * an "Unhandled exception" with the class name "IOException"
         * 
         * In such case we have to either:
         * - place this statement within try/catch block
         * - or add "throws" declaration
         * 
         * You will see these two suggestion with the Quick Fix assistance if you VS
         * Code,
         * or any other IDE
         * 
         * so immediately after the main() method signature,
         * we can add "throws IOException"
         */
        myFile.createNewFile();

        System.out.print("Enter an integer (whole) number:");
        Scanner sc = new Scanner(System.in);
        int intNumber = sc.nextInt();
        System.out.println("Integer Value: " + intNumber);

        /*
         * If we enter a string or a number with decimal points
         * Java will throw the exception "InputMismatchException"
         */

        /*
         * IMPORTANT NOTE (TYPES OF EXCEPTIONS):
         * *************************************
         * - Checked Exceptions => are verified by the compiler before the code is
         * executed
         * - Unchecked Exceptions => are NOT verified by the compiler.
         * Run-time exception and all its classes are considered to be
         * "Unchecked Exception"
         * 
         * Example#1: if you dig deep (CTRL+CLICK) the method .createNewFile()
         * you will see the Java native code:
         * 
         * public boolean createNewFile() throws IOException {...}
         * 
         * Since this method is built to throw an exception,
         * It means that "IOException" it's a type "Checked" exception
         * so we have to place the method that throws this exception
         * with try/catch or implement throws declaration
         * 
         * Example#2: if you dig deep (CTRL+CLICK) the method .nextInt()
         * you will see the Java native code:
         * public int nextInt() {
         * return nextInt(defaultRadix);
         * }
         * 
         * Since this method is NOT built to throw an exception,
         * so it's of type "Unchecked" exception
         * so we don't have to place it with try/catch or implement throws declaration
         * unless if we want to for handling any unexpected user'input
         * 
         * However, we can check all the possible exceptions for nextInt():
         * if we open the function and check the comments
         * 
         * @throws...
         */

        sc.close();
    } // main()
} // class file

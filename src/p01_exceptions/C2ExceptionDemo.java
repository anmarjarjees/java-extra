package p01_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C2ExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * Surround all the code that might throw an error (exception)
         * with a set of { } braces of try block
         */
        try {
            /*
             * If the user inputs a decimal value or a string
             * Java will throw an "Exception"
             * 
             * Two exceptions, we might examine in this example:
             * - InputMismatchException => different data type
             * - ArithmeticException => division by 0
             */
            System.out.print("Enter your first whole number (the numerator): ");
            int n1 = input.nextInt();
            System.out.print("Enter your second whole number (the denominator): ");
            int n2 = input.nextInt();
            double div = n1 / n2;
            System.out.println("The result of dividing " + n1 + " by " + n2 + " is: " + div);
        }
        // If you try to enter 0 for the denominator
        // you will see the exception name "ArithmeticException"
        /*
         * This ArithmeticException class is coming from the standard java.lang package
         * so we don't import it
         */
        catch (ArithmeticException e) {
            /*
             * Since Exception is an object, then we have access to its all useful methods
             */
            System.out.println(e.getMessage()); // getting the default Java error message for this exception
            // Or display our custom message:
            System.out.println("Division by 0 is infinite!");
        }
        // We can have multiple exceptions:
        // If you try to enter a string value for both numbers or any one of them
        // you will see the exception name "InputMismatchException"
        /*
         * This "InputMismatchException" class is coming
         * from the java.util package
         * so we have to import it
         */
        catch (InputMismatchException e) {
            System.out.println(e.getMessage()); // getting the default Java error message for this exception
            // Or display our custom message:
            System.out.println("Invalid input! Both values have to be whole numbers");
        }
        /*
         * Catching the error (exception) with catch() block:
         * Notice that your JAVA Editor/IDE can complete the try-catch block
         * And we can have the general "Exception" class
         * Link: https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html
         * 
         * The class Exception and any subclasses that are not also subclasses of
         * RuntimeException are checked exceptions
         * (is covered in details: ExceptionWithFile)
         * 
         * The "Exception" class can handle (catch) all the exceptions
         * This General "Exception" class is coming from the standard java.lang package
         * so we don't import it.
         * In such case, we used the polymorphism to catch the exception with the
         * superclass
         * 
         * IMPORTANT NOTE:
         * the superclass exception "Exception" class
         * has to be always written after the more specific one(s)
         */
        catch (Exception e) {
            System.out.println(e.getClass()); // learn about the specific Exception Class
            System.out.println(e.getMessage()); // getting the default Java error message for this exception
            // Or display our custom message:
            System.out.println("Error in running the application!");
        }
        /*
         * One more type of exception blocks is the "finally" block:
         * This block (optional) will always be executed whether we have or don't have
         * an exception
         */
        finally {
            System.out.println("This finally block text will always be printed :-)");
            /*
             * The finally block will not be by displaying funny messages!
             * it could be used for closing any opened object:
             * 
             * NOTE: Due to the variable scope,
             * the Scanner object has to be displayed outside the try block
             * inside the main() script
             */
            input.close();
        }

        /*
         * IMPORTANT NOTE:
         * If you want to write one block of catch() for handling multiple exceptions
         * in the same way => Listing them all with pipe "|"
         * 
         * catch (ArithmeticException | InputMismatchException e) {
         * 
         * }
         */
    } // end main()
} // end class file

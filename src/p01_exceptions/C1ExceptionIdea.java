package p01_exceptions;

import java.util.Scanner;

public class C1ExceptionIdea {

    public static void main(String[] args) {
        /*
         * Exception:
         * An event that occurs during the execution of a program that disrupts
         * the normal flow of instructions.
         * 
         * This is generally an unexpected or unwanted event which can occur
         * either at compile-time or run-time in application code
         * 
         * Ref: Rollbar blogs => https://rollbar.com/
         */

        /*
         * example dividing by 0 => an arithmetic exception
         */
        /*
         * simple test,
         * then trying exception with file
         */
        Scanner input = new Scanner(System.in);
        /*
         * The numerator => the number above the line in a fraction
         * The denominator => the number below the line in a fraction
         * 
         * IMPORTANT NOTE:
         * Java will not throw an exception if you divide by 0
         * if the data type is double or float data
         * So if the denominator has:
         * > the value of 0.0 (as double data type)
         * > f0.0(as float data type)
         * Java will just display the result as "infinity"
         * Because it supports The IEEE-754 standard
         * that describes floating-point formats,
         * a way to represent real numbers in hardware.
         * which say that when you divide by zero, in floating Point
         * arithmetic, you get either positive or negative Infinity depending on whether
         * the values that you're using are positive or negative
         * 
         * Java will throw and exception (a run-time error) if you divide by 0 of
         * integer data type as this operation is not allowed in Java
         * 
         * Notice if both the numerator and denominator are 0:
         * The output => The result of dividing 0.0 by 0.0 is: NaN
         */
        System.out.print("Enter your any number to divide (the numerator): ");
        double num1 = input.nextDouble();
        System.out.print("Enter your any number to divide by (the denominator): ");
        double num2 = input.nextDouble();

        // if num2 (the denominator) is 0 => (no exception) => infinity
        // if num1 and num2 are 0 => NaN
        double result = num1 / num2;
        System.out.println("The result of dividing " + num1 + " by " + num2 + " is: " + result);

        /*
         * But with using integer input:
         */
        System.out.print("Enter your first whole (integer) number (the numerator): ");
        int n1 = input.nextInt();
        System.out.print("Enter your second whole (integer) number (the denominator): ");
        int n2 = input.nextInt();
        double div = n1 / n2;
        System.out.println("The result of dividing " + n1 + " by " + n2 + " is: " + div);
        /*
         * Output:
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
         * at exceptions.Main.main(Main.java:58)
         * 
         * So our exception is "ArithmeticException" that occurs when dividing by 0
         * for integers
         */

        /*
         * Testing another common exception: going beyond the array length:
         */
        String[] names = { "Alex", "Sam", "Kate", "Martin", "Sarah" };
        /*
         * the array has 5 elements => the highest index is 4
         * but we are iterating till index 5!
         * 
         * Exception:
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
         * Index 5 out of bounds for length 5
         * 
         * The exception class is "ArrayIndexOutOfBoundsException"
         */
        for (int i = 0; i < 6; i++) {
            System.out.println("First Name:" + names[i]);
        }

        /*
         * To handle any exception => wrap our code that might generate an error
         * with try {} block
         * Check the next file :-)
         */

        input.close();
        /*
         * Important Notes:
         * Some methods in Java has the potential to throw exceptions
         * for example, if you hover the mouse over the method .nextInt(),
         * VS Code will show you the exceptions:
         * 
         * Throws:
         * InputMismatchException - if the next token does not match
         * the Integer regular expression, or is out of range
         * NoSuchElementException - if input is exhausted
         * IllegalStateException - if this scanner is closed
         * 
         * You can check them by going the "Scanner Class Page":
         * Link: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/
         * Scanner.html
         * 
         * Then click the "METHOD" from top menu and scroll to nextInt()
         * Link: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/
         * Scanner.html#nextInt()
         * 
         * so if you input a String value instead of integer numeric value,
         * You will get: InputMismatchException
         */
    } // end main()
} // end class file

package p01_exceptions;

public class C6ThrowCustomEx {
    public static void main(String[] args) {
        /*
         * We might need our app to throw an exception
         * based on our custom code/methods (based on the programmer's perspective)
         */

        double result = getGrossPayment(20, 25);
        System.out.println(result);

        // result = getGrossPayment(42, 25);
        System.out.println(result);
        /*
         * Exception in thread "main" java.lang.IllegalArgumentException:
         * Hours has to be between 1 to 40
         */

        double num1 = 190.43;
        double num2 = 91.89;
        /*
         * Java will show a compilation error:
         * Unhandled exception type OutOfRangeException
         */
        try {
            System.out.println("Average of " + num1 + " and " + num2 + " is: " + getAverage(num1, num2));
        } catch (OutOfRangeException e) {
            e.printStackTrace();
        }
    } // main()

    /*
     * Creating a simple method to calculate the gross pay
     * by multiplying the hours worked by the pay rate
     * 
     * with a condition that hours cannot exceed the 40 as a maximum
     */
    public static double getGrossPayment(double hours, double payRate) {
        if (hours > 40) {
            /*
             * using "trow" then the instantiation of an existing exception
             * Java provides many exceptions that we can use
             * or we can create a new exception class based on our needs
             * 
             * In this case, it's invalid (illegal)
             * to put more than 40 hours,
             * so we can use the Java exception class "IllegalArgumentException"
             * and passing to the constructor our custom message
             */
            throw new IllegalArgumentException("Hours has to be between 1 to 40");
            /*
             * NOTE: if we look inside the "IllegalArgumentException" class:
             * 
             * public class IllegalArgumentException extends RuntimeException {
             * public IllegalArgumentException() {
             * super();
             * }
             * }
             * 
             * Notice that it extends "RuntimeException"
             * so it's an "Unchecked Exception"
             * which means, we don't have to declare that our method throws that exception
             */
        } // end if
        return hours * payRate;
    } // getGrossPayment()

    public static double getAverage(double value1, double value2) throws OutOfRangeException {
        /*
         * we can add more () for better readability:
         * ((value1 < 0 || value1 > 100) || (value2 < 0 || value2 > 100))
         */
        if (value1 < 0 || value1 > 100 || value2 < 0 || value2 > 100) {
            /*
             * Notice below because our custom exception "OutOfRangeException"
             * extends the "Exception" class so it's a "Checked Exception"
             * 
             * So we must either specify it in our method signature
             * with the keyword "throw"
             * or by adding try/catch
             * as we explained before.
             */
            throw new OutOfRangeException();
        }
        return (value1 + value2) / 2;
    } // getAverage()
}
// class file

package p04_generics.s2_using_generics;

/* 
 * Demonstrates usage of the generic Output<T> class:
 * **************************************************
 * 
 * Key Points To Consider:
 * ***********************
 * 1- Java Generics enforce type safety at compile time.
 * 2- Generics do NOT accept primitive types directly (int, double, float)
 *    > we need to use "Wrapper classes": (Integer, Double, Float)
 * 3- Diamond operator <> allows type inference (no need to repeat the type).
 * 
 * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/package-summary.html
 * Link: https://docs.oracle.com/javase/tutorial/java/generics/types.html#diamond
 */
public class Main {
    public static void main(String[] args) {
        // Calling our class:

        // IMPORTANT NOTE: If we do this code/line below:
        // Output printSomething = new Output(200);
        /*
         * Java will warn about raw types and type safety!
         * The error message:
         * Output is a raw type.
         * References to generic type Output<T> should be parameterized
         * 
         * Because Java now needs to know the data type of the variable "printSomething"
         * Solution:
         * using <> with the data type after the Class name:
         */

        /*
         * In the code/line below, Java will give us this warning:
         * Type safety: The constructor Output(Object) belongs to the raw type Output.
         * References to generic type Output<T> should be parameterized
         */
        // Output<Integer> printSomething = new Output(200);

        /*
         * Solution:
         * We just need to add an empty <>
         * In older Java versions, we had to write <Integer> again,
         * In modern Java (since Java 7) the diamond operator <> allows type inference.
         */

        /*
         * Important Note:
         * ***************
         * Generics will NOT accept primitive data types:
         * - int, double, float
         * 
         * Instead, we use Wrapper Classes:
         * - Integer instead of int
         * - Double instead of double
         * - Float instead of float
         */

        // Correct way to instantiate generic class using Wrapper classes
        Output<Integer> print1 = new Output<>(200);
        print1.printVar();

        Output<Double> print2 = new Output<>(200.20);
        print2.printVar();

        Output<Float> print3 = new Output<>(100.75f);
        print3.printVar();

        Output<String> print4 = new Output<>("Java");
        print4.printVar();

    } // end main()

} // end class file

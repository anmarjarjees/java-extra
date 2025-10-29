package p04_generics.s1_why_generics;

/* 
 * Demonstrates why Generics are useful in Java
 * 
 * Currently, we have three separate classes:
 *  - OutputInt
 *  - OutputDouble
 *  - OutputString
 * 
 * Each class does essentially the same thing:
 *  - store a variable
 *  - print its value
 * 
 * This leads to code duplication.
 * Generics solve this by allowing one class to work with multiple types.
 * 
 * Link: https://docs.oracle.com/javase/tutorial/java/generics/index.html
 */
public class Main {
    public static void main(String[] args) {
        // you can instantiate the 3 objects...
        // Instantiate the 3 objects separately:
        OutputInt objInt = new OutputInt(42);
        OutputDouble objDouble = new OutputDouble(3.14);
        OutputString objString = new OutputString("Hello Generics");

        // Print values:
        objInt.printVar();
        objDouble.printVar();
        objString.printVar();

        /*
         * PROBLEM:
         * ********
         * 1- Each class is doing basically the same thing.
         * 2- Adding a new type (e.g., Float) means creating a new class.
         * 
         * SOLUTION:
         * *********
         * Use Generics to create a single class that works for all types.
         */
    }
}

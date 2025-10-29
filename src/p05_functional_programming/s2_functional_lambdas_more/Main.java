package p05_functional_programming.s2_functional_lambdas_more;

import java.util.function.DoubleBinaryOperator;

public class Main {
    public static void main(String[] args) {

        /*
         * 1) Using a custom functional interface with lambda
         * - Implements the single abstract method
         * - Can use {} for multiple lines of code
         */

        // Using the lambda expression with inner class:
        Average myAvg = (double n1, double n2) -> {
            // notice we added { } for multiple code lines demo:
            double total = n1 + n2;
            return total / 2;
        };

        System.out.println("Average: " + myAvg.getAverage(88, 93));

        /*
         * 2) Using Java 8 built-in functional interfaces
         * remember that Java 8 added two new packages to support the idea of
         * "Functional Programming":
         * - java.util.function
         * - java.util.stream
         * 
         * Refer to the "README.md" file:
         * 
         * java.util.function package provides commonly used functional interfaces
         * - For two doubles returning a double, use DoubleBinaryOperator
         * - Method name is applyAsDouble()
         * 
         * Java Functional Interfaces:
         * Link:
         * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.
         * html)
         * 
         * And one of the list that we can use based on our example is
         * "DoubleBinaryOperator"
         * Link: https://docs.oracle.com/javase/8/docs/api/java/util/function/
         * DoubleBinaryOperator.html
         * 
         * So we can use this built-in functional interface and delete our interface
         * file
         */
        DoubleBinaryOperator finalAvg = (double n1, double n2) -> {
            // notice we added { } for multiple code lines demo:
            double total = n1 + n2;
            return total / 2;
        };

        /*
         * Notice that functional interface doesn't have the method "getAverage"!
         * If you dig deep it's "applyAsDouble"
         */
        System.out.println("Average: " + finalAvg.applyAsDouble(88, 93));
    } // main
} // class

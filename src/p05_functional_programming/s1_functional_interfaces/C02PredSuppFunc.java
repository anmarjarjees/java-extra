package p05_functional_programming.s1_functional_interfaces;

import java.util.Scanner;
import java.util.ArrayList;

// Importing the required/used Functional Interfaces
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

public class C02PredSuppFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Practicing Predicate Functional Interface with
         * an inner anonymous class
         */
        Predicate<Integer> isEven = new Predicate<>() {
            @Override
            public boolean test(Integer number) {
                if (number % 2 == 0) {
                    return true;
                } else {
                    return false;
                }
            } // test()
        }; // inner class

        boolean result = isEven.test(100);
        System.out.println(result);

        /*
         * Practicing Function Functional Interface
         * 
         * @FunctionalInterface
         * public interface Function<T, R> {...}
         * 
         * R apply(T t);
         * 
         * R for result Type
         * T the type of the input parameter "t"
         * 
         * In the example below square is implementing the "apply()" main default
         * method
         * 
         * Lambda Template:
         * (anyVar) -> the code to run against the "anyVar"
         */
        Function<Double, Double> square = (number) -> number * number;

        double myNumber = 100;
        Double myNumberSqr = square.apply(myNumber);

        System.out.println("The square of " + myNumber + " is: " + myNumberSqr);

        /*
         * If we pass the actual numeric value to the function *
         * we have to pass our values as Double format
         * => with fractions (Decimal points)
         * Because we are using the Wrapper class "Double",
         * 
         * Otherwise Error:
         * The method apply(Double) in the type Function<Double,Double> is not
         * applicable for the arguments (int)
         */
        System.out.println("The square of 90 is: " + square.apply(90.0)); // OK
        // System.out.println("The square of 90 is: " + square.apply(90)); // Error

        /*
         * Practicing Supplier Functional Interface
         * 
         * public interface Supplier<T> {
         * 
         * Gets a result.
         *
         * @return a result
         * 
         * T get();
         */

        // Creating a variable named "greeting":
        /*
         * The code below will generate an error: Cannot return a void result
         * Because the LE code is just printing with no returns value!
         */
        // Supplier<String> greeting = () -> System.out.print("Welcome to Java!");

        // Solution1: Full Code:
        Supplier<String> greeting = () -> {
            return ("Welcome to Java!");
        };
        System.out.println(greeting.get()); // Welcome to Java!

        // Solution#2: Shorthand Code:
        Supplier<String> interfaceName = () -> "Supplier Interface";
        System.out.println(interfaceName.get()); // Supplier Interface

        Supplier<ArrayList<String>> empInfo = () -> {

            ArrayList<String> infoList = new ArrayList<>();

            System.out.print("Enter full name:");
            infoList.add(sc.nextLine());

            System.out.print("\nEnter Job Title:");
            infoList.add(sc.nextLine());

            System.out.print("\nEnter Company name:");
            infoList.add(sc.nextLine());

            return infoList;
        };

        System.out.println(empInfo.get());

        /*
         * Practising the "Function" functional interface for its default method
         * using again squareIt with Lambda expression to implement the "apply" method
         */

        // repeat the same logic again:
        Function<Integer, Integer> squareIt = (number) -> number * number;

        // then using addIt to add a number to itself (like times 2):
        Function<Integer, Integer> addIt = (number) -> number + number;

        /*
         * Since Function functional interface provides two methods:
         * - .apply()
         * - .andThen()
         * 
         * We can combine the two squareIt and addIt into a single one
         */
        int anyNumber = 2;
        int finalResult = squareIt.andThen(addIt).apply(anyNumber);
        System.out.println("The result squaring " + anyNumber + " then adding the number to itself is: " + finalResult);

        // Closing the scanner at the end :-)
        sc.close();
    } // main()
} // class file

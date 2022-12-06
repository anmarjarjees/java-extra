package p05_functional_programming.s1_functional_interfaces;

import java.util.List;
/* 
 * We need to import the "Consumer" functional Interface
 * to work with a functional programming
 */
import java.util.function.Consumer;

public class C01Consumer {
    public static void main(String[] args) {
        /*
         * Canada has 10 provinces and provinces and 3 three territories to the north. T
         * he provinces are, in alphabetical order: Alberta, British Columbia, Manitoba,
         * New Brunswick, Newfoundland and Labrador, Nova
         * Scotia, Ontario, Prince Edward Island, Quebec, and Saskatchewan.
         * 
         * The three territories are Northwest Territories, Nunavut, and Yukon.
         * 
         * Another way of creating and adding a collection of elements at once
         * by using the Static Method .of()
         * 
         * Don't forget that .of() method returns an "unmodifiable" set
         * Our collection became an "Immutable Object"
         * which is an object with a fixed state that cannot be changed after it is
         * constructed
         */
        // or declare a list:
        List<String> provinces = List.of("Alberta", "British Columbia", "Manitoba", "New Brunswick",
                "Newfoundland and Labrador", "NovaScotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan");

        System.out.println(provinces.size() + " provinces: " + provinces);

        System.out.println();
        /*
         * As we have learnt before, we can use the Lambda Expression to print the
         * list/collections as shown below:
         * 
         * Notice that Lambda Expression is an implementation of the
         * "Consumer Functional Interface"
         * from the java.util.function package.
         * 
         * Consumer<T> Interface => Represents an operation that accepts a single input
         * argument and returns no result.
         * 
         * This interface has one method => accept(T t) : void
         * so this code:
         * province -> System.out.println(province)
         * is this code:
         * accept(T t) : void
         */
        provinces.forEach(province -> System.out.println(province));

        /*
         * To clearly practice and understand the "Consumer" interface:
         * - importing the interface
         * - create a variable "printAnyString" of Consumer
         * and String data type for the elements:
         */
        Consumer<String> printAnyString = strValue -> System.out.println(strValue);

        /*
         * We are calling forEach() and passing the interface variable "printAnyString"
         * But the implementation we provided for the method "accept"
         * is what is being exectuted
         */
        provinces.forEach(printAnyString);

        /*
         * Even without calling a method like foreach():
         * we can still call/access the "Consumer" interface abstract method "accept"
         * directly and pass to it any object (T) type: String, Double, Integer
         * 
         * Definition => accept(String t) : void
         */
        printAnyString.accept("Learning about Consumer Functional Interface");
        // Learning about Consumer Functional Interface

        printAnyString.accept("Java is one of our lovely language!");

        // More practice about printing double values:
        Consumer<Double> printDoubleValue = numValue -> System.out.println(numValue);
        // accept(Double t) : void
        printDoubleValue.accept(10.0 + 5.0);

        // More practice about printing int values:
        Consumer<Integer> printIntValue = numValue -> System.out.println(numValue);
        printIntValue.accept(10 + 5);

        /*
         * Beside using the Lambda Expression: value -> System.out.println(value)
         * To implement the Consumer Interface method "accept"
         *
         * The implementation can be done in the form of a "Method Reference" => ::
         */
        Consumer<String> printString = System.out::println;
        printString.accept("Another way to work with Consumer method");

    } // main()
} // class file
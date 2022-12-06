package p04_generics.s4_wild_cards;

import java.util.ArrayList;
// Importing "List" class to use List object
import java.util.List;

import p04_generics.s3_more_generics.Car;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        printList(intList); // [1, 2, 3]

        List<String> strList = new ArrayList<>();
        strList.add("HTML");
        strList.add("CSS");
        strList.add("JavaScript");
        printList(strList); // [HTML, CSS, JavaScript]

        List<Car> carList = new ArrayList<>();
        carList.add(new Car());
        carList.add(new Car());
        printList(carList); // [the package with the class ref car@3baf30c, ...]
    } // end main

    /*
     * Create a method that takes a list
     * this list consists of any type of objects
     * then just printing the list
     * 
     * We can use "Wildcard" as a type of parameter with the generic
     * Using "?" for unknown data type:
     */
    private static void printList(List<?> myList) {
        System.out.println(myList);
    }

    /*
     * NOTE:
     * Although: Integer, String, Double, Float
     * Are all subclasses of "Object"
     * But We CANNOT use the data type to be: List<Object>
     * Because a list of "Integer" is not a subclass of a list of "Object"
     * 
     * Example:
     * 1. Declare Of declaring our method:
     * private static void printList(List<Object> myList) {...}
     * 
     * 2. Calling our method:
     * List<Integer> intList = new ArrayList<>();
     * printList(intList);
     * 
     * Java Error:
     * The method printList(List<Object>) in the type Main
     * is not applicable for the arguments (List<Integer>)
     */
} // end class file

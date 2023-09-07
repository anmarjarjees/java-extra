package p05_functional_programming.s4_streams_elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C2StreamMore {
    public static void main(String[] args) {
        /*
         * Practising more operations with .stream() static method
         */

        // Demo#1:
        // *******
        /*
         * Task (without using Steam):
         * ***************************
         * You have an array list "ArrayList" of Hobbies
         *
         * Do the following:
         * 1- List/sort the array alphabetically
         * 2- Going through each item (Hobby) in this list (loop or iterate) to:
         * > Capitalize the first character (letter) of each item (hobby)
         * > Print all the hobbies, except the ones that start with "x"
         * notice that your will print them on the fly... :-)
         * 
         * NOTE: When using "List" interface, we need to import the "java.util.List"
         */
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("boxing");
        hobbies.add("cooking");
        hobbies.add("xml");
        hobbies.add("dancing");
        hobbies.add("acting");
        hobbies.add("xing");

        // String[] hobbies = { "acting", "cooking", "xml", "dancing", "boxing", "xing"
        // };

        // Solution#1: Without using "Streams":
        System.out.println("List of Hobbies#1:");
        /*
         * To sort an ArrayList:
         * the "Collections" class has a static method ".sort()":
         * Collections.sort() to sort all List implementations
         * such as LinkedList and ArrayList
         */

        // 1. Sort the ListArray:
        Collections.sort(hobbies);

        /*
         * To recap:
         * *********
         * remember that we cannot use the method .sort() of the "Collections" class
         * with normal arrays! .sort() only for "ArrayList"
         * Error: The method sort(String[]) is undefined for the type Collection
         */
        //
        for (String hobby : hobbies) {
            // 2. Capitalize your the first letter
            hobby = hobby.toUpperCase();

            // 3. Exclude the hobbies that start with x from being printed
            if (!hobby.startsWith("X")) {
                System.out.println(hobby);
            }
        }

        System.out.println("Original Array List (after sorting):" + hobbies);

        System.out.println("********************");

        System.out.println("List of Hobbies#2:");

        /*
         * Before solution#2 with "Streams":
         * To recap and answer this question with "Stream" API
         * according to what we have learned previously,
         * we can:
         * - create a new Collection using a new Stream object!
         * - import the package "java.util.stream.Stream" is needed in this case => ;
         * - Then apply the Stream methods to this object
         */
        Stream<String> hobbiesStream = hobbies.stream();
        System.out.println("Printing 'hobbiesStream' items first attempt:");
        hobbiesStream.forEach(hobby -> System.out.println(hobby));

        /*
         * Or instead, we can just use method .stream()
         * with our ArrayList "hobbies" directly.
         * 
         * We can chain .stream() intermediate method with forEach() terminal method
         * to loop through an ArrayList object and print its elements
         */
        System.out.println("Printing 'hobbiesStream' items second attempt:");
        hobbies.stream().forEach(hobby -> System.out.println(hobby));

        System.out.println("********************");

        // Solution#2: With using "Streams":
        /*
         * NOTES:
         * 1- The methods below are listed/written in new lines for readability
         * 2- map(), filter(), and forEach()
         * each accepts/takes a function as an argument
         * 3- These 3 methods implement Functional Interfaces:
         * -> .map() => .map(Function<? super String, ? extends String> mapper)
         * -> .filter() => .filter(Predicate<? super String> predicate)
         * -> .forEach() => forEach(Consumer<? super String> action)
         * 4- These 3 methods create a new object instead of modifying the existing one
         */
        hobbies.stream()
                .map(hobby -> hobby.toUpperCase()) // map method to capitalize the items
                .filter(hobby -> !hobby.startsWith("X")) // filter method to exclude items starts with x
                .sorted() // sorting in alphabetical order
                .forEach(hobby -> System.out.println(hobby));

        /*
         * Final Important Note To Consider:
         * *********************************
         * Examine the code below by calling again our object "hobbiesStream" with the
         * same methods:
         */

        /*
         * hobbiesStream.map(hobby -> hobby.toUpperCase())
         * .filter(hobby -> !hobby.startsWith("X"))
         * .sorted()
         * .forEach(hobby -> System.out.println(hobby));
         */

        /*
         * Running the example below, Java will throw this exception
         * "IllegalStateException":
         * 
         * Exception in thread "main" java.lang.IllegalStateException:
         * stream has already been operated upon or closed
         * 
         * Reason:
         * Because "Streams" can only be used once.
         * Streams were NOT created to save objects!
         * Streams were created to perform some operations on a group of objects
         */

        // Demo#2:
        // *******
        /*
         * For saving the result/output of "Streams"
         * so in the previous example to save the new collection that contains:
         * - Filtered list (without first character x)
         * - Capital letters
         * - Sorted items
         * 
         * So we can reuse it or refer to it again.
         * 
         * The answer for this demo is to create a new collection!
         * 
         * We can chain the same methods except the last one! We CANNOT end with
         * .forEach()
         * Java will throw this error:
         * "Type mismatch: cannot convert from void to List<String>Java"
         * 
         * Because the terminal method .forEach() has a void return type
         * So we need to replace the .forEach() method
         * with another method that returns a collection called ".collect()"
         * 
         * We need to pass "Collectors.toList()" static method
         */
        List<String> enhancedHobbiesList = hobbies.stream()
                .map(hobby -> hobby.toUpperCase())
                .filter(hobby -> !hobby.startsWith("X"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nThe Enhanced Hobbies List: " + enhancedHobbiesList);

        /*
         * IMPORTANT REVIEW:
         * ****************
         * - We used Lambda notation 3 times within these methods: map(), filter(), and
         * forEach()
         * 
         * - It's an example of using a "Functional Programming" :-)
         * By passing a function (The lambda) as an argument to each of the listed
         * methods
         * 
         * - Remember that Streams API are "immutable"
         * so it will not change the original list elements when performing stream
         * operation on them
         * 
         * - There are two types of methods (operations) in the Stream API:
         * > Intermediate Methods => operations that can be intermediate or terminal
         * (anywhere)
         * > Terminal Methods => operation that can ONLY be terminal (at the end of all
         * other methods)
         * ForEach() is a "Terminal" method => must be called at the end
         * .map(), filter(), and sorted() are "Intermediate" methods
         */

        // for testing again:
        System.out.print("\nThe original \"hobbies\" ArrayList: ");
        System.out.println(hobbies); // [acting, boxing, cooking, dancing, xing, xml]
    } // main()
} // class file
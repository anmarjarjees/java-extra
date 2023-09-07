package p05_functional_programming.s4_streams_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class C1StreamBasic {
    public static void main(String[] args) {
        /*
         * The essential of Stream API:
         * ****************************
         * Interface Stream<T>
         * Link: https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
         *
         * Stream:
         * A sequence of elements supporting sequential and parallel aggregate
         * operations.
         * 
         * Notice that we will start with simple demos to understand how to use Stream
         * step by step
         * Then applying most of these demos into single one advanced example :-) later
         */

        // Demo#1:
        // *******
        int[] evenNumbers = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        /*
         * 1. Creating a stream of this array
         * By Calling the public static "stream" of the class "Arrays"
         * 
         * 2. Performing an operation on the stream numbers without affecting the
         * original array
         */

        // Example1: Printing the normal sequence of numbers from (0 to 20)
        System.out.println("All Even Numbers:");

        // Using Static method "stream()" of "Arrays" class:
        /*
         * "Arrays" class Static Method => stream()
         * Returns a sequential stream with the specified array as its source.
         * 
         * The .stream() method can return:
         * - a stream of data type "IntStream" for integer values
         * - a stream of data type "DoubleStream" for double values
         * - a stream of data type "LongStream" for long integer values
         * - a stream of data type generic <T> Stream<T>:
         * Stream<String>, Stream<Integer>, etc...
         * 
         * Link:
         * https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#stream-T:A-
         */
        Arrays.stream(evenNumbers).forEach(number -> System.out.print(number + " "));

        // Example2: Printing the normal sequence of numbers (even/odd) from (0 to 21)
        // by dividing each number by 2
        System.out.println("\n\nAll Even Numbers/2:");
        Arrays.stream(evenNumbers)
                .forEach(num -> System.out.print(num / 2 + " "));

        // Example2: Printing the sequence odd numbers only from (1 to 10)
        System.out.println("\n\nOdd Numbers (1-21) by adding 1:");
        Arrays.stream(evenNumbers)
                .forEach(num -> System.out.print(num + 1 + " "));

        // Example3: Printing the sequence odd numbers only from (1 to 9)
        System.out.println("\n\nOdd Numbers (1-9):");
        Arrays.stream(evenNumbers)
                .forEach(num -> {
                    if (num <= 9) {
                        System.out.println(num + 1 + " ");
                    }
                });

        // Demo#2:
        // *******
        /*
         * Creating a "Stream<>" Interface data type variable from a simple array:
         */
        Double[] prices = new Double[] { 45.67, 42.38, 62.54, 42.80 };

        /*
         * Using the "Stream" class with generics <>
         * of type "Double" according to our array data types (elements)
         * 
         * NOTE:
         * We need to import the "Stream" interface: interface Stream<T>
         * From the package "java.util.stream"
         */

        // 1. Creating a stream out of an Array:
        Stream<Double> pricesStream = Arrays.stream(prices);

        System.out.println("Our Stream \"pricesStream\": " + pricesStream);
        // Our Stream "pricesStream": java.util.stream.ReferencePipeline$Head@681a9515

        /*
         * HINT:
         * Notice that by convention, programmers usually just use the variable "s"
         * to refer to every element in a 's'tream
         * like using "i" with "for" loop for iteration :-)
         */

        // 2. Creating a stream out of an Array:
        // HINT => forEach(Consumer<? super Double> action) : void
        pricesStream.forEach(s -> System.out.println(s));

        // Demo#3:
        // *******
        /*
         * Creating a "Stream<T>" Interface data type variable from a collection
         * "ArrayList":
         */
        List<String> bookList = new ArrayList<>();
        bookList.add("Python Programming");
        bookList.add("Java, all in one!");
        bookList.add("C# Application Development");
        bookList.add("PHP for the Web");

        Stream<String> bookListStream = bookList.stream();
        bookListStream.forEach(s -> System.out.println("Book name: " + s));

        // Demo#4:
        // *******
        /*
         * Creating a stream from scratch without any existing array or collection
         */

        // Creating a stream variable on the fly :-)
        Stream<String> fruitsStream = Stream.of("orange", "cherry", "banana", "apple");

        // Practicing with the stream methods:
        // typing our stream "fruitsStream" => the IDE will list all its methods :-)
        // example below: using sorted() method to sort the stream, but it will NOT
        // printed for sure!
        // fruitsStream.sorted();

        // Thats why we need to chain another method "forEach()":
        /*
         * To recap:
         * IDE Hint => forEach(Consumer<? super String> action)
         * this method "forEach()" takes a "Consumer" as an argument
         * "Consumer" is a functional interface that has one single method "accept()"
         * "Consumer" as a functional interface can accept a lambda expression
         */
        fruitsStream.sorted().forEach(s -> System.out.println(s));

        /*
         * Let's try .parallel() method,
         * stream will process the array's elements in parallel.
         * so multiple "threads" are used to process the elements of the stream
         * at the same time
         * 
         * so the output/result
         * - will be in different random order
         * - will be vary every time the code is executed
         */
        System.out.println("Odd Numbers (1-21) Random Order:");
        // just by adding the method .parallel()
        Arrays.stream(evenNumbers).parallel()
                .forEach(num -> System.out.println(num + 1 + " "));

        // Demo#5:
        // *******
        // Just a quick recap :-)
        // Creating a simple String elements array:
        String[] languages = { "Java", "C#", "Python", "PHP", "JavaScript" };

        // Task: Use Stream with one simple method forEach():

        System.out.print("\n\nProgramming Languages 1:");
        // Solution#1: By creating a new Stream object:
        Stream<String> languagesStream = Arrays.stream(languages);
        languagesStream.forEach(language -> System.out.print("\t"+language));

        System.out.print("\n\nProgramming Languages 2:");
        // Solution#2: By using Arrays.stream() to convert array into Stream
        Arrays.stream(languages).forEach(language -> System.out.print("\t"+language));
    } // main()
} // class file

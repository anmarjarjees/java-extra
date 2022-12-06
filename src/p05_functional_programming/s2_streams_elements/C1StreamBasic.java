package p05_functional_programming.s2_streams_elements;

import java.util.Arrays;

public class C1StreamBasic {
    public static void main(String[] args) {
        /*
         * The essential of stream
         * Link: https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
         * 
         * Array Static Method => stream()
         * Returns a sequential stream with the specified array as its source.
         * Link:
         * https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#stream-T:A-
         */
        int[] evenNumbers = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        /*
         * 1. Creating a stream of this array
         * By Calling the public static "stream" of the class "Arrays"
         * 
         * 2. Performing an operation on the stream numbers without affecting the
         * original array
         */

        // Example1: Printing the nomal sequence of numbers (even/odd) from (0 to 21)
        // by dividing each number by 2
        System.out.println("Even Numbers:");
        Arrays.stream(evenNumbers)
                .forEach(num -> System.out.println(num / 2 + " "));

        // Example2: Printing the sequence odd numbers only from (1 to 10)
        System.out.println("Odd Numbers (1-21):");
        Arrays.stream(evenNumbers)
                .forEach(num -> System.out.println(num + 1 + " "));

        // Example3: Printing the sequence odd numbers only from (1 to 9)
        System.out.println("Odd Numbers (1-9):");
        Arrays.stream(evenNumbers)
                .forEach(num -> {
                    if (num <= 9) {
                        System.out.println(num + 1 + " ");
                    }
                });

        /*
         * Let's try .parallel() method,
         * stream will process the array's elements in parallel.
         * so multiple threads are used to process the elements of the stream
         * at the same time
         * 
         * so the output/result
         * - will be in different random order
         * - will be vary every time the code is exectuted
         */
        System.out.println("Odd Numbers (1-21) Random Order:");
        // just by adding the method .parallel()
        Arrays.stream(evenNumbers).parallel()
                .forEach(num -> System.out.println(num + 1 + " "));

        // Creating a String array
        // String[] languages = { "Java", "C#", "Python", "PHP" };

        // Using Arrays.stream() to convert
        // array into Stream
        // Stream<String> stream = Arrays.stream(languages);

    } // main()
} // class file

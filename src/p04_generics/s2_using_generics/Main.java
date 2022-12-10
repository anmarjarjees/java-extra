package p04_generics.s2_using_generics;

public class Main {
    public static void main(String[] args) {
        // Calling our class:
        // If we do this code/line below:
        // Output printSomething = new Output(200);
        /*
         * Java will throw this error:
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
         * Solutions: We just needs to add an empty <>
         * In the older versions of Java, we used to add <Integer> again,
         * but with the new versions no need
         */

        /*
         * Important Note:
         * Generics will not accept primitive data types:
         * int, double, float
         * 
         * We have to use the "Wrapper Classes":
         * Integer instead of int
         * Double instead of double
         * Float instead of float
         */
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

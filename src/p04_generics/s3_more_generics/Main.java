package p04_generics.s3_more_generics;

public class Main {
    public static void main(String[] args) {
        /*
         * Now Java will throw these error:
         * Cannot infer type arguments for Output<>
         * 
         * Because we changed our "Output" class to extend only Vehicle class data type
         * so it became more specific to work only with any type of "Vehicle":
         * - Car
         * - Bus
         */
        // Output<Integer> print1 = new Output<>(200);
        // Output<Double> print2 = new Output<>(200.20);

        Output<Car> print1 = new Output<>(new Car());
        print1.printVar();

        Output<Bus> print2 = new Output<>(new Bus());
        print2.printVar();

        printAnything("ABC"); // class java.lang.String
        printAnything(123); // class java.lang.Integer
        printAnything(17.98); // class java.lang.Double
        printAnything(18.45f); // class java.lang.Float
        printAnything(new Car()); // class p03_generics.s3_more_generics.Car
        printAnything(new Bus()); // class p03_generics.s3_more_generics.Bus

        printAnyTwoVar("ABC", 100);
        // First Variable Data Type: class java.lang.String
        // Second Variable Data Type: class java.lang.Integer

        System.out.println(returnAnyType("Java Programming"));
        System.out.println(returnAnyType(10583494));
        System.out.println(returnAnyType(89.34));
    } // end main()

    /*
     * Besides the "Generic Classes",
     * We can have "Generic Methods"
     */
    private static <T> void printAnything(T anyVariable) {
        System.out.println(anyVariable.getClass());
        /*
         * NOTE:
         * .getClass() cannot be used with primitive data types:
         * 
         * Example:
         * int number;
         * number.getClass();
         * 
         * Java Error: Cannot invoke getClass() on the primitive type int
         */
    }

    /*
     * We can add multiple parameters of Generic Data types
     */
    private static <T> void printAnyTwoVar(T anyVariable1, T anyVariable2) {
        System.out.println("First Variable Data Type: " + anyVariable1.getClass());
        System.out.println("Second Variable Data Type: " + anyVariable2.getClass());
        // System.out.println(anyVariable1 + anyVariable2);
    }

    /*
     * We can also make our method(s) return a generic data type
     */
    private static <T> T returnAnyType(T anyVariable) {
        return anyVariable;
    }
} // end class file

package p05_functional_programming.s3_functional_interfaces;

public class C03MyFuncInterface {
    public static void main(String[] args) {
        MyFuncInterface<Integer, Integer> adding = (n1, n2) -> n1 + n1;
        MyFuncInterface<Integer, Integer> multiply = (n1, n2) -> n1 * n1;

        int myNumber1 = 10;
        int myNumber2 = 10;

        System.out.println(adding.calculate(myNumber1, myNumber2));
        System.out.println(multiply.calculate(myNumber1, myNumber2));

        MyFuncInterface<Double, Double> addingDouble = (n1, n2) -> n1 + n1;

        double number1 = 98;
        double number2 = 92;
        System.out.println(addingDouble.calculate(number1, number2));

        // the code below will generate this error:
        // System.out.println(addingDouble.calculate(98, 92));

        System.out.println(addingDouble.calculate(98.8, 92.3));
    } // main()
} //

package p05_functional_programming.s2_functional_lambdas_more;

/*
 * Functional Interface with parameters and return value:
 * ******************************************************
 * 
 * - Only one abstract method
 * - Can take parameters and return a value
 * - Annotated with @FunctionalInterface for clarity
 * 
 * Link: https://docs.oracle.com/javase/8/docs/api/java/lang/FunctionalInterface.html
 */
@FunctionalInterface
public interface Average {
    double getAverage(double num1, double num2);
}

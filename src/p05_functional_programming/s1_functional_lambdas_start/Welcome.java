package p05_functional_programming.s1_functional_lambdas_start;

/* 
 * Functional Interface Example:
 * *****************************
 * 
 * NOTE:
 * - By convention, a functional interface should have only one abstract method.
 * - Using the annotation @FunctionalInterface is a good practice:
 *   - It informs the compiler and other developers 
 *     that this interface is intended
 *     to be functional.
 *   - If you accidentally add a second abstract method, 
 *     the compiler will throw a warning/error.
 * 
 * Link: https://docs.oracle.com/javase/17/docs/api/java/lang/FunctionalInterface.html
 */
@FunctionalInterface
public interface Welcome {
    // single abstract method:
    void greet();
}

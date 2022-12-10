package p05_functional_programming.s1_functional_interfaces;

/* 
 * This file is to be used with C03MyFuncInterface
 */

/* 
* Based on Java recommendations,
* we should annotate our custom Functional Interface
* with: @FunctionalInterface
* 
* So Java will enforce the rule of at least one and only one
* abstract method has to be exists.
* 
* you can try to remove the function java will show an error
* you can try to remove the annotation, then remove your function => no errors
* 
*/

// T, R, K, V by convention 
@FunctionalInterface
public interface MyFuncInterface<T, R> {
    R calculate(T x, T y);
}

/*
 * Notice we could create our custom Functional Interface
 * to be very limited to return integer data types
 * without acceding any parameters:
 */

/*
 * @FunctionalInterface
 * public interface MyFuncInterface {
 * int calculate(int x, int y);
 * }
 */

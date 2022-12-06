package p05_functional_programming.s1_functional_interfaces;

/* 
 * Based on Java recomendations,
 * we should anottate our custom Functional Interface
 * with: @FunctionalInterface
 * 
 * So Java will inforce the rule of at least one and only one
 * abstract method has to be exists.
 * 
 * you can try to remove the function java will show an error
 * you can try to remove the anotation, then remove your function => no errors
 * 
 */
@FunctionalInterface
public interface C03MyFuncInerface {
    int calculate(int x, int y);
}

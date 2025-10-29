package p05_functional_programming.s1_functional_lambdas_start;

/*
 * Classical implementation of the functional interface "Welcome"
 * Using a separate class
 */
public class WelcomeGreet implements Welcome {

    // Implementing the single abstract method "greet"
    @Override
    public void greet() {
        System.out.println("Welcome to Functional Interfaces with Java :-)");
    }
}

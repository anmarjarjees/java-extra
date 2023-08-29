package p05_functional_programming.s1_functional_lambdas_start;

/*
 * Our WelcomeGreet java class file to implement our interface "Welcome"
 */
public class WelcomeGreet implements Welcome {
    
    // Override our method "greet":
    public void greet() {
        System.out.println("Welcome to Functional Interfaces with Java :-)");
    }
}

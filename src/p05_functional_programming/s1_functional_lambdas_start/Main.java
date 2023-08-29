package p05_functional_programming.s1_functional_lambdas_start;

public class Main {
    public static void main(String[] args) {
        /*
         * Demonstrating the 3 ways for implementing our functional interface "Welcome"
         */

        // First: Using the normal long classical way :-)
        WelcomeGreet myGreeting1 = new WelcomeGreet();

        // calling the method greet:
        myGreeting1.greet();


        // Second: Using the inner class way (Anonymous Inner Class => so need for class "WelcomeGreet"):
        Welcome myGreeting2 = new Welcome() {
            // Using the quick fix by adding the unimplemented method:
            @Override
            public void greet() {
                System.out.println("Welcome again to Functional Interfaces with Java :-)");
            }            
        };

        // calling the method greet:
        myGreeting2.greet();

        // Third: Using Lambdas
        // Notice that VS Code or IJ will give us a hint to replace the code with lambda!
        // For example click after the opening { then the hint icon :-) => More Actions...
            
        Welcome myGreeting3 = () ->  System.out.println("Finally Welcome to lambda expression :-)");

        myGreeting3.greet();

    }
}

package p05_functional_programming.s1_functional_lambdas_start;

public class Main {
    public static void main(String[] args) {
        /*
         * Demonstrating 3 ways to implement a functional interface:
         * *********************************************************
         * 1) Classical implementation using a separate class
         * 2) Anonymous inner class
         * 3) Lambda expression
         */

        // 1) Classical way: separate class implementation
        // By using the normal long classical way :-)
        WelcomeGreet myGreeting1 = new WelcomeGreet();

        // calling the method greet:
        myGreeting1.greet();

        // 2) Anonymous Inner Class (no separate class needed)
        // By using the inner class way:
        // (Anonymous Inner Class => so need for class "WelcomeGreet"):
        Welcome myGreeting2 = new Welcome() {
            // Using the quick fix by adding the unimplemented method:
            @Override
            public void greet() {
                System.out.println("Welcome again to Functional Interfaces with Java :-)");
            }
        };

        // calling the method greet:
        myGreeting2.greet();

        // 3) Lambda Expression (shortest, modern way)
        // By using "Lambdas"
        /*
         * Notice that VS Code or IJ will give us a hint
         * to replace the code with lambda!
         * 
         * For example click after the opening { then the hint icon :-) => More
         * Actions...
         */
        // Only possible because Welcome is a functional interface:
        Welcome myGreeting3 = () -> System.out.println("Finally Welcome to lambda expression :-)");

        myGreeting3.greet();
        /*
         * Lambda expressions:
         * *******************
         * - Provide a concise way to represent a single method interface
         * - Can improve readability and reduce boilerplate code
         * - Link:
         * https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
         */

    }
}

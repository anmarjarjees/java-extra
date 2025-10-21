package p02_anonymous_inner_classes;

// ALT + SHIFT + F => Format Code in VS code
// CTRL + AL + L => format Code in Intellij
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.StartDriving();

        /*
         * Imagine, that we only have one car
         * that start driving on water!
         * so only one car that can drive on road and water!
         * we need:
         * > only one object
         * > Override (change) the method "StartDriving"
         * - to print driving on water!
         * 
         * so below we creating a very special car,
         * this car can drive on water also :-)
         */

        /*
         * Creating a new type of a unique car that can drive on water also!
         * can only have one instance
         * 
         * In the example below, we are creating an anonymous subclass block of "Car"
         * class
         * so it's an anonymous class definition by using { }
         * this inner class can override methods from the original class "Car"
         * It's a one-time use class
         * 
         * Although the code below looks like creating an object of type "Car"!
         * But we are creating an object named "specialCar"
         * from an anonymous sub-class of type "Car" that doesn't have a name
         */
        Car specialCar = new Car() {
            @Override
            public void StartDriving() {
                System.out.println("Driving on water!");
            }
        };

        // calling our special object "specialCar":
        specialCar.StartDriving();

        /*
         * we can also use the idea of Inner/Anonymous with Interfaces!
         */

        /*
         * The other way of creating an anonymous class
         * is by implementing an interface
         * 
         * so it's useful to create one instance
         * to implement an interface methods directly
         * without creating an actual class that implement the interface
         * then an instantiating an object !
         * 
         * Remember that "Payment" is an interface
         * We CANNOT instantiate an interface in OOP:
         * The line => Payment mPayment = new Payment();
         * will have this Error => Cannot instantiate the type Payment'
         * 
         * Unless we create an anonymous inner class
         * that can implement the interface :-)
         * 
         * Although the code below looks like creating an object of type "Payment"!
         * But we are creating an object named "myPayment"
         * from a class type that doesn't have a name
         */

        // calling our Interface:
        Payment myPayment = new Payment() {
            @Override
            public double calculateGrossPay(double hours) {
                // Assuming that $20 per hour:
                return (hours * 20);
            }

            @Override
            public void doSomething(int i, double x) {
                System.out.println("Nothing to do!");

            }
        }; // Payment Inner class
        /*
         * NOTE:
         * We need to end the inner class block with ;
         * Otherwise, Java Compiler will complain :-(
         */

    } // main()
} // class

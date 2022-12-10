package p04_generics.s3_more_generics;

/* 
 * Make our Generic class more specialized for any type of "Vehicle"
 * Since we hav:
 * - Car class extends Vehicle class
 * - Bus class extends Vehicle class
 * 
 * we can use "extends" with the <T> "for type by convention" to extend the superclass "Vehicle"
 * so class "Output" can print both "Car" and "Bus"
 * 
 * When we make our Generic "T" type extending a class,
 * it's called "Bounded Generic" because we are using "Bounded Type Parameters"
 * because we are giving a bound/limit for a certain types of Data: Vehicle
 * 
 * Link: https://docs.oracle.com/javase/tutorial/java/generics/bounded.html
 * 
 * We can make our type "T" implement interfaces
 * But in this case we cannot use the keyword "implement" with generics 
 * We have to use the same keyword for inheritance which is "extends"
 * 
 * Example:
 * public class Output<T extends Serializable> {...}
 * 
 * We can also have multiple bounds:
 * We can make our type "T" extends a "class" and an "interface" at the same time
 * by using the "&" as a separator.
 * 
 * Example:
 * public class Output<T extends Vehicle & Serializable> {...}
 * 
 * IMPORTANT NOTE:
 * We have to make our Generic class extending the Class first,
 * then the interface later:
 * Vehicle & Serializable & Cloneable
 * 
 * Switching them will not work
 */

// public class Output<T extends Vehicle & Serializable> {
// public class Output<T extends Serializable> {
public class Output<T extends Vehicle> {
    /*
     * NOTE:
     * Since "T" is extending Vehicle,
     * so our variable below "myVar" of type "T"
     * can use all the methods inside "Vehicle"
     * check the last method "drive"
     */
    T myVar;

    // Passing a value of type "T" also
    public Output(T myVar) {
        this.myVar = myVar;
    }

    public void printVar() {
        System.out.println("Your variable is: " + myVar);
    }

    // adding another method for calling other method from the superclass:
    public void drive() {
        myVar.StartDriving();
        myVar.turn("right");
        myVar.stopDriving();
    }
} // end class

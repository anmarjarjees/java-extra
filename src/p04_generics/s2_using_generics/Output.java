package p04_generics.s2_using_generics;

/* 
 * Generic Class Example:
 * **********************
 * 
 * Adding the type parameter: <>
 * By convention, a type parameter in Java is written as a capital "T".
 * "T" represents the type of variable/value that this class will handle.
 * 
 * This allows us to create one class that works for multiple types
 * without duplicating code for int, double, String, etc.
 * 
 * Link: https://docs.oracle.com/javase/tutorial/java/generics/index.html
 */
public class Output<T> {
    /*
     * Instead of using a fixed data type like int, double, or String,
     * we use the type parameter "T"
     * Notice that the actual type is determined when we instantiate the class
     */
    T myVar;

    // Constructor accepting a value of type T
    public Output(T myVar) {
        this.myVar = myVar;
    }

    // Method to print the stored variable
    public void printVar() {
        System.out.println("Your variable is: " + myVar);
    }
} // end class

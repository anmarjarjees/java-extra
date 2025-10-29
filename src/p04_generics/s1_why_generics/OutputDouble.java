package p04_generics.s1_why_generics;

/* 
 * Class to store and print a double variable
 * 
 * Problem:
 * - Each type needs a separate class
 * - Not scalable for many types
 * 
 * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Double.html
 */
public class OutputDouble {
    private double myVar;

    public OutputDouble(double myVar) {
        this.myVar = myVar;
    }

    public void printVar() {
        System.out.println("Your variable is: " + myVar);
    }
}

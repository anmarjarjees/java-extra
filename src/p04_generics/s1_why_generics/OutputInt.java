package p04_generics.s1_why_generics;

/* 
 * Class to store and print an integer variable
 * 
 * Problem:
 * - We need a separate class for each data type
 * - Leads to code duplication
 * 
 * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html
 */
public class OutputInt {
    int myVar;

    public OutputInt(int myVar) {
        this.myVar = myVar;
    }

    public void printVar() {
        System.out.println("Your value is: " + myVar);
    }
}

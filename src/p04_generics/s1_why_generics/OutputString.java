package p04_generics.s1_why_generics;

/* 
 * Class to store and print a String variable
 * 
 * Problem:
 * - Each type requires a separate class
 * - Leads to unnecessary code duplication
 * 
 * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
 */
public class OutputString {
    String myVar;

    public OutputString(String myVar) {
        this.myVar = myVar;
    }

    public void printVar() {
        System.out.println("Your variable is: " + myVar);
    }
}

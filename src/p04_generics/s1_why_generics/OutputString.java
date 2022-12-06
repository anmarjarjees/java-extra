package p04_generics.s1_why_generics;

public class OutputString {
    String myVar;

    public OutputString(String myVar) {
        this.myVar = myVar;
    }

    public void printVar() {
        System.out.println("Your variable is: " + myVar);
    }
}

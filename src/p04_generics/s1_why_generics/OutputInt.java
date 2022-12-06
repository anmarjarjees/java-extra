package p04_generics.s1_why_generics;

public class OutputInt {
    int myVar;

    public OutputInt(int myVar) {
        this.myVar = myVar;
    }

    public void printVar() {
        System.out.println("Your value is: " + myVar);
    }
}

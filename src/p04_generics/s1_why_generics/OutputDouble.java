package p04_generics.s1_why_generics;

public class OutputDouble {
    private double myVar;

    public OutputDouble(double myVar) {
        this.myVar = myVar;
    }

    public void printVar() {
        System.out.println("Your variable is: " + myVar);
    }
}

package p04_generics.s2_using_generics;

/* 
 * Adding the type parameter: <>
 * By convention Type parameter in Java is written in Capital T => "T"
 * but it could be any name or title
 * So "T" represent the type of any variable/value that our class "Output"
 * is going to print/output
 */
public class Output<T> {
    /*
     * Instead of using a fixed data type like int, double,...
     * we can make it general by using the data type "T"
     * since our class is using <T>
     */
    T myVar;

    // Passing a value of type "T" also
    public Output(T myVar) {
        this.myVar = myVar;
    }

    public void printVar() {
        System.out.println("Your variable is: " + myVar);
    }
} // end class

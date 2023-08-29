package p05_functional_programming.s1_functional_lambdas_start;

// Our interface file "Welcome" to be implemented in the Main.java file

/* 
NOTE:
Good practice to add this annotation just to help us remember that it's a functional interface that can have one method only.
If we add another method the complier will give us a warning
*/
@FunctionalInterface
public interface Welcome {
    void greet();    
}

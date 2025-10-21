package p03_marker_interfaces.s1_basics;

/* 
 * This class is implementing the "LibraryMember" marker interface
 * so we can think that it's marked to be able to run certain methods
 * (for example: borrow, use, or access materials)
 * based on our validation with an if condition for sure
 * 
 * Simple Explanation :-)
 * **********************
 * By implementing the "LibraryMember" interface, 
 * this class is tagged (or marked) as an official library member.
 * 
 * This means that when we check at runtime:
 *     if (object instanceof LibraryMember)
 * we can safely allow the object to perform special actions 
 * such as borrowing books or accessing library resources.
 * 
 * Notes:
 * - The class "Person" gets no methods from the interface 
 *   because marker interfaces are empty.
 * - However, the *presence* of the interface tells the program 
 *   that this object has permission to do specific tasks.
 * 
 * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 * Link: https://docs.oracle.com/javase/tutorial/java/IandI/usinginterface.html
 * Link: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
 */
public class Person implements LibraryMember {
    // Method that defines what a library member can do: borrow materials
    public void canBorrow() {
        System.out.println("You are allowed to borrow any materials from the library");
    }

    // Method that defines another allowed action: use a computer
    public void canUse() {
        System.out.println("You are allowed to use the computer for maximum 2 hours session");
    }

    // Method that defines access privileges: online resources
    public void canAccess() {
        System.out.println("You are allowed to access all the online collections of the library");
    }
} // class

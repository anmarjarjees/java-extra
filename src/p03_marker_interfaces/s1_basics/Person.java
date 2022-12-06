package p03_marker_interfaces.s1_basics;

/* 
 * This class is implementing the "Display" marker interface
 * so we can think that it's marked to be able to run the greet() method
 * based on our validation with if condition for sure
 */
public class Person implements LibraryMember {
    public void canBorrow() {
        System.out.println("You are allowed to borrow any materials from the library");
    }

    public void canUse() {
        System.out.println("You are allowed to use the computer for maximum 2 hours session");
    }

    public void canAccess() {
        System.out.println("You are allowed to access all the online collections of the library");
    }
}

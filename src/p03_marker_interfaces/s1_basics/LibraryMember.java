package p03_marker_interfaces.s1_basics;

/* 
 * Marker Interface => has NO methods | has NO fields
 * Nothing to declare in this interface (Just empty)
 * 
 * It can be used to assign/give permission to other class(es)
 * It gives the classes that implement it special privileges
 * 
 * So we can check if the class is implementing the interface
 * if so, then we can let its instance/object do/call/execute its method(s) for example
 * 
 * This interface is named "LibraryMember"
 * So any class implements this interface
 * it's object(s) can borrow books from the library
 *
 * Simple Explanation :-)
 * **********************
 * A marker interface is an "empty" interface used only to mark a class 
 * with a specific meaning or permission.
 * 
 * Example:
 *    if (obj instanceof LibraryMember) {
 *        // allow borrowing books
 *    }
 * 
 * Notes:
 * - This type of interface helps identify certain classes at runtime.
 * - It does not define behavior but gives a signal that the class is special.
 * - Before annotations (like @Override), marker interfaces were often used for tagging.
 * 
 * Link: https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html
 * Link: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
 */
public interface LibraryMember {

}

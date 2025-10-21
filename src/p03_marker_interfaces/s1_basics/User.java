package p03_marker_interfaces.s1_basics;

/* 
 * This class "User" does NOT implement the "LibraryMember" marker interface.
 * 
 * Simple Explanation :-)
 * ***********************
 * Since this class is not marked as a "LibraryMember",
 * any object created from this class will NOT have permission 
 * to perform actions like borrowing or accessing library materials.
 * 
 * For example:
 *     if (user instanceof LibraryMember) {
 *         // allowed to borrow
 *     } else {
 *         // not allowed
 *     }
 * 
 * Notes:
 * - This class is still a normal Java class with no special privileges.
 * - It can be used to represent users who have not registered as library members yet.
 * 
 * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 * Link: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
 */
public class User {

}

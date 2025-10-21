package p03_marker_interfaces.s1_basics;

public class Main {
    // psvm: stands for public static void main (the program's entry point)
    public static void main(String[] args) {
        Person user1 = new Person();

        /*
         * We don't want, for example, this instance "myObj"
         * to call the greet() method for printing the message
         * before checking if its class (blueprint) is implementing
         * or not implementing the marker interface "Display".
         * 
         * Simple Explanation :-)
         * **********************
         * The idea is to protect some methods from being called by classes
         * that are not marked (not implementing a specific marker interface).
         * 
         * Example idea:
         * if (object instanceof Display) {
         * object.greet();
         * }
         * else {
         * System.out.println("Access denied!");
         * }
         */

        // Check if the class is an instance of the interface "Display()":
        /*
         * NOTE:
         * Notice that we are checking if the "myObj1" is an instance of an interface
         * "Display".
         * Yes, since myObj1 is an instance of a Class that implements the interface
         * "Display",
         * we can check if "myObj1" is an instance of that interface or not.
         * 
         * Reminder:
         * The "instanceof" operator is used to test if an object
         * is an instance of a specific class or implements a specific interface.
         * 
         * Syntax: object instanceof InterfaceName
         */

        // Check if the user1 is a library member
        // In coding, check if user1 is an instance of LibraryMember interface:
        if (user1 instanceof LibraryMember) {
            System.out.println("You can borrow/use the computer/access the online library resources.");
            user1.canBorrow();
        } else {
            System.out.println(
                    "Sorry, you doesn't have the permission to borrow/use the computer/access the online library resources.");
        }

        /*
         * To recall :-)
         * - Because "Person" implements "LibraryMember",
         * the 'instanceof' check returns true.
         * - This allows the program to safely call library-related methods.
         * - If we used a "User" object instead (which doesn't implement the interface),
         * the else block would execute instead.
         */
    } // main()
} // class

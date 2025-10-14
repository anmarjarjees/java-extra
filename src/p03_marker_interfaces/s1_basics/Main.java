package p03_marker_interfaces.s1_basics;

public class Main {
    // psvm:
    public static void main(String[] args) {
        Person user1 = new Person();

        /*
         * We don't want for example this instance "myObj"
         * to call the gree() method for printing the message
         * Before checking if its class (blueprint) is implementing or not implementing
         * the marker interface "Display"
         */

        // Check if the class is an instance of the interface "Display()":
        /*
         * NOTE:
         * Notice that we are checking of the "myObj1" is an instance of an interface
         * "Display"
         * Yes, since myObj1 is an instance of a Class the implements the interface
         * "Display"
         * So we can check if "myObj1" is an instance of an interface "Display" or not
         */

        // check if the user1 is a library member
        // in coding check if user1 is an instance of LibraryMember interface:
        if (user1 instanceof LibraryMember) {
            System.out.println("You can borrow/use the computer/access the online library resources.");
            user1.canBorrow();
        } else {
            System.out.println(
                    "Sorry, you doesn't have the permission to borrow/use the computer/access the online library resources.");
        }
    }
}

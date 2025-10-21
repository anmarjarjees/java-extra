package p03_marker_interfaces.s3_cloneable;

/**
 * Demonstrates the difference between:
 * ***********************************
 * - Object reference assignment
 * - Cloning using the Cloneable interface
 * - Shallow copy behavior
 * 
 * Link:
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html#clone()
 * Link:
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Cloneable.html
 * Link:
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html#hashCode()
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Example 1: Object reference assignment
        Student st1 = new Student("Alex Chow", "Web Development", 25);

        // Assigning st1 to st2 (both point to same memory location)
        Student st2 = st1;
        System.out.println(st1 == st2); // true
        /*
         * Now objects st1 and st2 are pointing to the same memory address.
         * Changing st1 will also affect st2 and vice versa.
         */

        System.out.println("Same info for the two students:");
        st1.printInfo();
        st2.printInfo();

        // Change the name for one student
        // Change the name for one student (only student2)? What do you think?
        // Change the name for st2
        st2.setName("Martin Smith");
        System.out.println("After changing only one student:");

        // testing:
        st1.printInfo(); // also changed
        st2.printInfo();

        // Example 2: Array references
        int[] myArray1 = { 1, 2, 3, 4 };
        int[] myArray2;
        myArray2 = myArray1;

        // Modify myArray2:
        myArray2[0] = 5; // override the value of the first element
        // myArray2[1] = 6;
        // myArray2[2] = 7;
        // myArray2[3] = 8;
        System.out.println("myArray1 index0 value: " + myArray1[0] +
                "\nmyArray2 index0 value: " + myArray1[0]);
        /*
         * Demonstrates that arrays are also reference types.
         * Changing one array affects the other if assigned directly.
         */

        // Example 3: Cloning using Cloneable
        System.out.println("Working with cloning:");
        /*
         * After using "Cloneable Interface" to solve the issue
         */
        Employee emp1 = new Employee("James Dean", "Web Developer", 35);

        /*
         * Problems and Solutions:
         * ***********************
         * 
         * Problem:
         * --------
         * 1- If we just write this code => Employee emp2 = emp1.clone();
         * Java Compiler Error => Type mismatch: cannot convert from Object to Employee
         * which means when clone() method clones an object,
         * It will return the cloned object in the form of the super class "Object"!
         * 
         * So:
         * 1- clone() returns Object => need explicit cast to Employee
         * 2- clone() may throw "CloneNotSupportedException"
         * => handled by 'throws' in main method
         * 
         * Solution:
         * ---------
         * We have to explicitly convert (type casting) it into our class "Employee"
         * 
         * 2- Java Compiler will complain if we try to clone an object
         * withOUT try() catch() block
         * Object java.lang.Object.clone() throws CloneNotSupportedException
         * 
         * Solution:
         * We can:
         * - wrap our code within try/catch block
         * - or just add to the main method "throws CloneNotSupportedException"
         * The method clone() from the type Object is not visible
         */

        Employee emp2 = (Employee) emp1.clone();

        // Verify that both objects have the same properties:
        System.out.println(emp1);
        System.out.println(emp2);

        // For testing to verify that both objects are two separate copies:
        /*
         * Java assigns a unique number (hash code value) for each object
         * so if the code of both objects is different => they are two separate copies
         * We can use the .hasCode() method:
         * a predefined method from class "Object"
         */
        // Verify that they are separate objects (different memory addresses):
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        System.out.println(emp1 == emp2); // false: confirms they are different objects

        /*
         * Now you can try to change any object: emp1, emp2
         * then print them again
         * and you will see that they are separate copies
         */

        emp2.setName("Alain Delon");

        System.out.println(emp1.getName()); // James Dean
        System.out.println(emp2.getName()); // Alain Delon

        /*
         * To summarize:
         * *************
         * - Direct assignment copies the reference, not the object.
         * - clone() creates a shallow copy (different memory location)
         * - hashCode() can be used to verify that objects are different
         * - Cloneable interface is necessary for Object.clone() to work
         */
    } // main()
} // class

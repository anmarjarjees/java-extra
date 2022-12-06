package p03_marker_interfaces.s3_cloneable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student st1 = new Student("Alex Chow", "Web Development", 25);

        Student st2 = st1;
        System.out.println(st1 == st2); // true
        /*
         * Now objects "student1" and "student2"
         * have (pointing to) the same memory address
         * 
         * so changing the student1 will also change student2 and vise versa!
         */
        System.out.println("Same info for the two students:");
        st1.getInfo();
        st2.getInfo();

        // Change the name for one student
        st2.setName("Martin Smith");
        System.out.println("After changing only one student:");

        st1.getInfo();
        st2.getInfo();

        // Another example:
        int[] myArray1 = { 1, 2, 3, 4 };
        int[] myArray2;
        myArray2 = myArray1;

        myArray2[0] = 5;
        // myArray2[1] = 6;
        // myArray2[2] = 7;
        // myArray2[3] = 8;
        System.out.println("myArray1 index0 value: " + myArray1[0] + "\nmyArray2 index0 value: " + myArray1[0]);

        System.out.println("Working with cloning:");
        /*
         * After using Cloneable Interface to solve the issue
         */
        Employee emp1 = new Employee("James Dean", "Web Developer", 35);

        /*
         * Problems and Solutions:
         * 1- If we just write this code => Employee emp2 = emp1.clone();
         * Java Compiler Error => Type mismatch: cannot convert from Object to Employee
         * which means when clone() method clones an object,
         * It will return the cloned object in the form of the super class "Object"!
         * 
         * Solution:
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

        // for testing to verify the both objects have the same properties/values:
        System.out.println(emp1);
        System.out.println(emp2);

        // for testing to verify that both objects are two separate copies:
        /*
         * Java assigns a unique number (hash code value) for each object
         * so if the code of both objects is different => they are two separate copies
         * We can use the .hasCode() method:
         * a predefined method from class "Object"
         */
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        /*
         * now you can try to change any object: emp1, emp2 then print them again
         * and you will see that they are separate copies
         */

        System.out.println(emp1 == emp2); // true
    }
}

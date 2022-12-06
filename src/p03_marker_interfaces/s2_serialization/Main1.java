package p03_marker_interfaces.s2_serialization;

import java.io.File;

// With Serializing, we need to import:
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main1 {
    public static void main(String[] args) {
        try {
            /*
             * Relative Path: src/p01_marker_interfaces/s2_serialization/test.ser
             * Or just use a simple path
             * (I have created a folder named "temp-files" in the root folder)
             * => "temp-files/fileName.ser"
             * Specifying the relative path,
             * otherwise it will be inside the project root folder
             * 
             * Using new File() to create a file, if the file already exists,
             * it will override it
             * 
             * If the path doesn't exits like: "temp/test.ser"
             * Java will throw this exception: FileNotFoundException
             * 
             * NOTE: By convention, we use the .ser extension for "serialization"
             */
            File myFile = new File("temp-files/test.ser");

            // FileOutputStream object to be used on writing on this file
            FileOutputStream fos = new FileOutputStream(myFile);

            // Open a file stream:
            /*
             * You just need to pass any object that implements the Serializable interface
             * to an instance of "ObjectOutputStream" to serialize it.
             */
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Or just writing the two statements above in one line of code:
            /*
             * ObjectOutputStream oos = new ObjectOutputStream(
             * new FileOutputStream(myFile));
             */

            // Create the object
            Employee emp1 = new Employee("Alex Chow", "Computer Programmer", 25);

            // Object serialization
            oos.writeObject(emp1);

            System.out.println(
                    "Your object with all its properties has been saved to test.ser file inside \"temp-files\" folder");
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    } // end main()
} // end class file

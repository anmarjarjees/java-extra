package p03_marker_interfaces.s2_serialization;

import java.io.File;

// With Serializing, we need to import:
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Demonstrates Java Object Serialization.
 *
 * Serialization = Converting an object into a byte stream,
 * so that it can be saved to a file or transferred over a network.
 *
 * Link:
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/Serializable.html
 * Link:
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/ObjectOutputStream.html
 */
public class Main1 {
    public static void main(String[] args) {
        try {
            /*
             * We will save the serialized object in a file.
             * File name convention: ".ser" extension = serialized file.
             * 
             * Examples of valid file paths:
             * *****************************
             * - Relative: "temp-files/test.ser"
             * - Absolute: "C:\\Users\\anmar\\Documents\\test.ser"
             * 
             * Relative Path: src/p01_marker_interfaces/s2_serialization/test.ser
             * Or just use a simple path
             * 
             * NOTE:
             * *****
             * I have created a folder named "temp-files" in the root folder "src":
             * => "temp-files/fileName.ser"
             * Specifying the relative path,
             * otherwise it will be inside the project root folder
             * 
             * Using new File() to create a file, if the file already exists,
             * it will override it
             * 
             * If the path (directory) doesn't exist like: "temp/test.ser"
             * Java will throw this exception: "FileNotFoundException"
             * 
             * NOTE: By convention, we use the .ser extension for "serialization"
             */

            // Create the object "myFile" of type "File":
            // For Saving our obj into a file .ser by convention:
            File myFile = new File("temp-files/test.ser");

            /*
             * Step 1: Create a FileOutputStream
             * This connects your Java program to the physical file.
             */
            FileOutputStream fos = new FileOutputStream(myFile);

            // Open a file stream:
            /*
             * Step 2: Wrap the FileOutputStream in an ObjectOutputStream
             * This stream handles object serialization — converting your Java object
             * into bytes that can be written to the file.
             */
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Or just writing the two statements above in one line of code:
            /*
             * ObjectOutputStream oos = new ObjectOutputStream(
             * new FileOutputStream(myFile));
             */

            /*
             * Step 3: Create an object to serialize
             * Make sure the class (Employee) implements java.io.Serializable,
             * otherwise you'll get a NotSerializableException.
             */
            Employee emp1 = new Employee("Alex Chow", "Computer Programmer", 25);

            // Finally: Object serialization
            /*
             * Step 4: Serialize (write) the object
             * This line converts the object into a stream of bytes and writes it to
             * test.ser.
             */
            oos.writeObject(emp1);

            /*
             * Optional: Print confirmation for the user.
             */
            // Just printing an optional confirmation message:
            System.out.println(
                    "Your object with all its properties has been saved to test.ser file inside \"temp-files\" folder");

            /*
             * Step 5: Always close streams to free system resources.
             */
            oos.close();
        } catch (IOException e) {
            // If something goes wrong (e.g., invalid path, no write permissions)
            System.out.println("Error: " + e.getMessage());
        }
    } // end main()
} // end class file

package p03_marker_interfaces.s2_serialization;

import java.io.File;

// import java.io.FileOutputStream;

// import java.io.ObjectOutputStream;

/* 
 * Notice that in this file,
 * we are also practising the use of "Stream" in Java :-)
 */
// With Deserializing, we need to import:
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Demonstrates Java Object Deserialization:
 * *****************************************
 * 
 * Deserialization = Converting a previously serialized byte stream
 * back into a Java object.
 * 
 * Link:
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/ObjectInputStream.html
 * Link:
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html
 * Link:
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/Serializable.html
 */
public class Main2 {
    /*
     * We can use the other way of throwing an exception
     * if we don't want to implement try and catch blocks.
     * 
     * Based on Java Compiler, we need to add these two exceptions:
     * - IOException => in case the file path doesn't exist
     * - ClassNotFoundException => for readObject() method of ObjectInputStream
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
         * Relative Path:
         * **************
         * > src\p01_marker_interfaces\s2_serialization\test.ser
         * 
         * "temp-files/test.ser"
         * Specifying the relative path ensures we know where the file is located.
         * Otherwise, Java will look in the project root folder.
         */
        File myFile = new File("temp-files/test.ser");

        /*
         * Step 1: Open a file stream
         * FileInputStream connects the program to the physical .ser file.
         * ObjectInputStream reads the bytes and reconstructs the object.
         */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile));

        /*
         * Step 2: Deserialize the object
         * The object is read from the file and cast back to its original type
         * (Employee).
         */
        Employee emp2 = (Employee) ois.readObject();

        // Step 3: Use the deserialized object
        System.out.println("Deserialized Employee Object:");
        System.out.println(emp2);

        // Step 4: Always close streams to free resources
        ois.close();

        /*
         * important Optional Note:
         * ************************
         * If you prefer try-catch instead of throwing exceptions:
         * try {
         * // deserialization code
         * } catch (FileNotFoundException e) {
         * System.out.println("File not found: " + e.getMessage());
         * } catch (IOException | ClassNotFoundException e) {
         * e.printStackTrace();
         * }
         */
    } // end main()
} // end class file

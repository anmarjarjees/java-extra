package p03_marker_interfaces.s2_serialization;

import java.io.File;

// import java.io.FileOutputStream;

// import java.io.ObjectOutputStream;

// With Deserializing, we need to import:
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main2 {
    /*
     * We can use the other way of throwing an exception
     * if we don't want to implement try and catch blocks
     * 
     * Based on Java Compiler, we need to add these two exceptions:
     * - IOException => in case the file path doesn't exists
     * - ClassNotFoundException => for readObject() method of "ObjectInputStream"
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // try {
        /*
         * Relative Path: src\p01_marker_interfaces\s2_serialization\test.ser
         * Specifying the relative path,
         * otherwise it will be inside the project root folder
         */
        File myFile = new File("temp-files/test.ser");

        // Open a file stream:
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile));

        // Object deserialization
        Employee emp2 = (Employee) ois.readObject();

        System.out.println(emp2);

        ois.close();
        // }
        // catch (Exception e) {
        // System.out.println(e.getClass()); // class java.io.FileNotFoundException
        // System.out.println(e.getMessage()); // test.ser (The system cannot find the
        // file specified)
        // }
    } // end main()
} // end class file

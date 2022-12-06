package p01_exceptions;

/* 
 * Notice that this is our custom exception
 * we named it "OutOfRangeException" class
 * to be used with "C6ThrowCustomEx" class file
 * 
 * it has to extend the Exception class
 */
public class OutOfRangeException extends Exception {
    /*
     * Creating two constructors:
     * 
     * - Default one (no parameters)
     * - Custom One that accept a message
     * 
     * Don't forget that with OOP,
     * we don't have to create/declare the default class constructor
     * if we:
     * - don't need to initialize or setting any value
     * - don't add any other custom constructor
     */

    public OutOfRangeException() {
        this("Input value has to be between the specified range of values");
    }

    public OutOfRangeException(String msg) {
        // calling the Constructor from the superclass "Exception"
        // to pass the "msg"
        super(msg);
    }

} // class file

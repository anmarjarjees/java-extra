package p03_marker_interfaces.s2_serialization;

import java.io.Serializable;

/* 
 * Java commonly used interfaces:
 * - Cloneable => from java.lang
 * - Serializable => from java.io.
 * - Remote => import java.rmi.Remote;
 */
// import java.rmi.Remote; // for Remote interface

/* 
 * The "Employee" class implements "Serializable" interface,
 * so we can serialize its object(s)
 */
public class Employee implements Serializable {
    /*
     * Try the code without the "serialVersionUID":
     * 
     * The serialization runtime associates with each serializable class a version
     * number called a "serialVersionUID".
     * 
     * Is used during deserialization to verify that the sender and receiver of a
     * serialized object have loaded classes for that object that are compatible
     * with respect to serialization.
     * 
     * If the receiver has loaded a class for the object that has a different
     * serialVersionUID than that of the corresponding sender's class, then
     * deserialization will result in an "InvalidClassException".
     * 
     * A serializable class can declare its own serialVersionUID explicitly by
     * declaring a field named "serialVersionUID" that must be "static", "final",
     * and of type "long":
     * 
     * ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L;
     * 
     * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/
     * Serializable.html
     * 
     * 
     * With a specialized Java IDE like eclipse,
     * You can select the option from the intellisense
     * to let the IDE generates a long version number
     * It will be created based on the class name, interface, fields, and methods
     * 
     * 
     * IMPORTANT NOTE: Notice that:
     * 1. If we don't add this variable statement
     * Java will control the Serial version behind the scenes,
     * so any change we make in this class structure:
     * - Java will update/change the long value of "serialVersionUID"
     * so its object has to be serialized again before being deserialized
     * otherwise, Java will show this message:
     * Exception in thread "main" java.io.InvalidClassException:
     * 
     * 2. If we explicitly define the value of "serialVersionUID"
     * Java will have NO control the Serial version,
     * so any change we make in this class structure:
     * - Java will NOT update/change the value of "serialVersionUID"
     * since it has been set by us "the developers :-)"
     * So when we just deserialize the object before being serialized
     * Our code will run fine but with the previous settings of the object
     * 
     * Put it on action: comment/uncomment
     */

    // long value:
    // private static final long serialVersionUID = 6971726947666774470L;

    // Class :
    private String name, jobTitle;
    private double payment;

    private int empId;

    // Constructor:
    public Employee(String name, String jobTitle, double payment) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.payment = payment;
    }

    public String toString() {
        // First Way:
        // => using the classical way with concatenation:
        String msg = "";
        msg += name + " - " + "Job Title: " + jobTitle; // keep going

        // Second Way:
        // => instead of using + for concatenating string, using "StringBuffer":
        StringBuffer sb = new StringBuffer();
        return sb.append(name)
                .append(" - ")
                .append("Job Title: ")
                .append(jobTitle)
                .append(" - ")
                .append("Hourly Payment: ")
                .append("$" + payment)
                .toString();
    }

    // Just adding public getter and setter as usual :-)
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}

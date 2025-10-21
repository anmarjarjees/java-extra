package p03_marker_interfaces.s3_cloneable;

/* 
 * This class must implement the interface "Cloneable"
 * so its object(s) can be duplicated (cloned)
 * 
 * Cloneable interface is from the default package of Java,
 * so no need to import it (it's built-in by default)
 * 
 * Simple Explanation :-)
 * **********************
 * - By implementing Cloneable, you tell Java that objects of this class
 *   can be safely cloned using the clone() method.
 * - If a class does NOT implement Cloneable and you call clone(),
 *   Java throws CloneNotSupportedException.
 * 
 * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Cloneable.html
 * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html#clone()
 */
public class Employee implements Cloneable {
    private String name, jobTitle;
    private double payment;

    // Constructor:
    public Employee(String name, String jobTitle, double payment) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.payment = payment;
    }

    // toString() method to display object data:
    public String toString() {
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

    // Getters:
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getPayment() {
        return payment;
    }

    // Setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    /*
     * IMPORTANT NOTE:
     * ***************
     * > The clone() method comes from the Java superclass "Object".
     * > The clone() method in Object is protected.
     * So you have to override the clone() method in your class and make it public.
     * This allows external code to call clone() on your objects.
     */

    // Option 1: Full try-catch block
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    // Option 2: Using "throws" (alternative)
    /*
     * @Override
     * protected Object clone() throws CloneNotSupportedException {
     * return super.clone();
     * }
     */

    /*
     * To summarize:
     * *************
     * - Cloneable is a marker interface: no methods to implement.
     * - clone() creates a shallow copy of the object by default.
     * - Deep cloning requires manual copying of mutable fields.
     */
} // class

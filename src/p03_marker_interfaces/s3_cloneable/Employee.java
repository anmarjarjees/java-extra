package p03_marker_interfaces.s3_cloneable;

/* 
 * This class must implement the interface "Cloneable"
 * so its object(s) can be duplicated (cloned)
 * 
 * Cloneable interface is from the default package of Java,
 * so no need to be imported (it's built-in by default)
 */
public class Employee implements Cloneable {
    private String name, jobTitle;
    private double payment;

    public Employee(String name, String jobTitle, double payment) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.payment = payment;
    }

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

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getPayment() {
        return payment;
    }

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
     * The clone() method is coming from the Java mother class "Object"
     * The clone() method is protected.
     * So you have to override the clone() method
     * override the clone() method in your class and make it public.
     */

    // we can use the full try() catch() block:
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    // or just using the shorthand with the keyword: "throws"
    // and the exception class: "CloneNotSupportedException"
    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    // return super.clone();
    // }
}

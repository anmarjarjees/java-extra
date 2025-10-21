package p03_marker_interfaces.s3_cloneable;

/* 
 * Simple Student class for practice.
 * 
 * Note:
 * - This class does NOT implement Cloneable.
 *   So its objects cannot be cloned using Object.clone() without modification.
 * - This can be used to compare cloning behavior with Employee class.
 * 
 * Simple Explanation (To review) :-)
 * **********************************
 * - Fields: name, program, age
 * - Getter and setter methods provided for all fields
 * - A custom method printInfo() to display student information
 * - Alternatively, you could override toString() to achieve the same effect
 * 
 * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 */
public class Student {
    private String name, program;
    private int age;

    // Constructor:
    public Student(String name, String program, int age) {
        this.name = name;
        this.program = program;
        this.age = age;
    }

    // Setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getters:
    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getAge() {
        return age;
    }

    /*
     * Custom method to print student information
     * 
     * Can also override toString() if preferred:
     * 
     * @Override
     * public String toString() {
     * return "Full Name: " + name + "\nProgram: " + program + "\nAge: " + age;
     * }
     */
    public void printInfo() {
        System.out.println("Full Name: " + name + "\nProgram: " + program + "\nAge: " + age);
    }
} // class

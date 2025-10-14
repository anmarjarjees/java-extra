package p03_marker_interfaces.s3_cloneable;

public class Student {
    private String name, program;
    private int age;

    public Student(String name, String program, int age) {
        this.name = name;
        this.program = program;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
     * Creating a new custom method for printing the Student Info,
     * Or just override the toString() :-)
     */
    public void printInfo() {
        System.out.println("Full Name: " + name + "\nProgram: " + program + "\nAge: " + age);
    }
}

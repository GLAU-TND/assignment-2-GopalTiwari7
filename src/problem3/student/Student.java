package problem3.student;

public class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}

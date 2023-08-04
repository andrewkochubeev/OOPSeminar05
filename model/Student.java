package model;

public class Student extends User {
    private int studentId;

    public Student(String lastName, String firstName, String secondName, int studentId) {
        super(lastName, firstName, secondName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

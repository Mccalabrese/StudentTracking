package school;
import util.*;

public class Student extends Person implements Displayable {
    private int studentId;
    private int finalGrade;
    public Student() {

    }
    public Student(String firstName, String lastName, int studentId, int finalGrade) {
        super(firstName, lastName);
        setStudentId(studentId);
        setFinalGrade(finalGrade);
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getFinalGrade() {
        return finalGrade;
    }
    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }
    public String display() {
        return "Student ID: " + getStudentId() + "   " + getFullName() + " Final Grade: " + getFinalGrade();
    }
}

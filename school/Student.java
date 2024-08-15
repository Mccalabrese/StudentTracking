package school;
import util.*;

/**
 *  Represents a Student, which will be assigned both a student id and a final grade
 */
public class Student extends Person implements Displayable {

    /**
     * The unique identifier assigned to this student.
     */
    private int studentId;

    /**
     * The final grade earned by the student in a course.
     */
    private int finalGrade;

    /**
     * Default empty constructor, creates a student instance.
     */
    public Student() {
    }

    /**
     * Constructs a Student object with the given first name, last name, student ID, and final grade.
     * @param firstName the student's first name
     * @param lastName the student's last name
     * @param studentId the student's student ID
     * @param finalGrade the student's final grade
     */
    public Student(String firstName, String lastName, int studentId, int finalGrade) {
        super(firstName, lastName);
        setStudentId(studentId);
        setFinalGrade(finalGrade);
    }

    /**
     * Retrieves the student ID of the student
     * @return the student's student ID
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Sets the student ID of the student
     * @param studentId the student ID of the student
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * Retrieves the final grade of the student
     * @return the student's final grade
     */
    public int getFinalGrade() {
        return finalGrade;
    }

    /**
     * Sets the final grade of the student.
     * @param finalGrade the final grade of the student
     */
    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    /**
     * Display method
     * @return a print-out with the student id, student full name, and student's final grade
     */
    public String display() {
        return "Student ID: " + getStudentId() + "   " + getFullName() + " Final Grade: " + getFinalGrade();
    }
}

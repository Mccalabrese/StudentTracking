package school;
import util.*;

/**
 *  Represents a Teacher, which will be assigned a subject
 */
public class Teacher extends Person implements Displayable {

    /**
     * The field of study this teacher is teaching.
     */
    private String subject;

    /**
     * Default empty constructor, creates a teacher instance.
     */
    public Teacher() {
    }

    /**
     * Constructs a teacher object with the given first name, last name, and subject.
     * @param firstName the teacher's first name
     * @param lastName the teacher's last name
     * @param subject the teacher's assigned subject
     */
    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        setSubject(subject);
    }

    /**
     * Retrieves the subject that the teacher is teaching
     * @return the teacher's subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject assigned to the teacher
     * @param subject the subject of the teacher
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Display method
     * @return a print-out with the full name and subject of the teacher
     */
    public String display() {
        return getFullName() + " teaches " + getSubject();
    }

}

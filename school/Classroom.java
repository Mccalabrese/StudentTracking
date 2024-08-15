package school;
import util.*;

import java.util.ArrayList;

/**
 *  Represents a Classroom, which will contain a teacher, room number, and students
 */
public class Classroom implements Displayable{

    /**
     * The Classroom's room number
     */
    private int roomNumber;

    /**
     * The teacher assigned to this classroom
     */
    private Displayable teacher;

    /**
     * The list of students enrolled in this classroom
     */
    private ArrayList<Displayable> students;

    /**
     * Default empty constructor, creates a classroom instance.
     */
    public Classroom() {
    }

    /**
     * Constructor, creates a classroom instance.
     * @param roomNumber the classroom's room number
     * @param teacher the teacher of the classroom
     * @param students the students in the classroom
     */
    public Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students) {
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.students = students;
    }

    /**
     * Display method
     * @return Returns a string representation of the classroom, including room number, teacher, and students.
     */
    @Override
    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Room Number: ").append(roomNumber).append("\n");
        sb.append(teacher.display()).append("\n");
        for (int i = 0; i < students.size(); i++) {
            sb.append(students.get(i).display());
            if (i < students.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }



}

package school;
import util.*;

import java.util.ArrayList;

public class Classroom implements Displayable{
    private int roomNumber;
    private Displayable teacher;
    private ArrayList<Displayable> students;
    public Classroom() {
    }
    public Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students) {
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.students = students;
    }
    @Override // This annotation indicates overriding the inherited method
    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Room Number: ").append(roomNumber).append("\n");
        sb.append(teacher.display()).append("\n");
        for (int i = 0; i < students.size(); i++) {
            sb.append(students.get(i).display());
            if (i < students.size() - 1) {
                sb.append("\n"); // Append a newline only if it's not the last student
            }
        }
        return sb.toString();
    }



}

import school.*;
import util.Displayable;
import util.KeyboardReader;

import java.util.ArrayList;

/**
 *  Represents a Printed Report, which will contain a classroom, teacher, and students
 *  Tests the {@link Classroom} class.
 *  Tests the {@link Student} class.
 *  Tests the {@link Teacher} class.
 */
public class PrintReports {
    public static void main(String[] args) {
        new PrintReports();
    }
    private ArrayList<Displayable> classrooms;
    private boolean isFirstIteration = true;

    /**
     * Method to generate a classroom object with a room number, teacher, and student.
     * @return classroom new classroom object with room number, teacher, and student
     */
    public Displayable enterClassroom() {
        int roomNumber = 0;
        if (isFirstIteration) {
            System.out.println("First You Need To Create A Classroom\n");
        }
        do {
            try {
                roomNumber = KeyboardReader.getPromptedInt("Enter Room Number: ");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
        } while (roomNumber < 100);
        System.out.println("Now You Need To Enter A Teacher For The Classroom.\n");
        Displayable teacher = enterTeacher();
        ArrayList<Displayable> students = new ArrayList<>();
        boolean isFirstStudent = true;
        char choice;
        do {
            if (isFirstStudent) {
                System.out.println("\nNow You Need To Add Students For The Classroom");
                isFirstStudent = false;
            }
            students.add(enterStudent());
            choice = KeyboardReader.getPromptedChar("Enter Another Student? (Y/N): ");
            choice = Character.toUpperCase(choice);
        } while (choice == 'Y');
        isFirstIteration = false;

        Classroom classroom = new Classroom(roomNumber, teacher, students);
        return classroom;
    }

    /**
     * Method to generate a Teacher object with a name and subject
     * @return Teacher New teacher with a name and subject
     */
    public Teacher enterTeacher() {
        String firstName = KeyboardReader.getPromptedString("Enter Teacher First Name: ");
        String lastName = KeyboardReader.getPromptedString("Enter Teacher Last Name: ");
        String subject = KeyboardReader.getPromptedString("Enter Subject Taught: ");
        return new Teacher(firstName, lastName, subject);
    }

    /**
     * Method to generate a new student object with name, id, and grade.
     * @return Student New Student with full name, ID, and grade.
     */
    public Student enterStudent() {
        int studentId = 0;
        String firstName;
        String lastName;
        int finalGrade = 0;
        firstName = KeyboardReader.getPromptedString("Enter Student First Name: ");
        lastName = KeyboardReader.getPromptedString("Enter Student Last Name: ");
        do {
            try {
                studentId = KeyboardReader.getPromptedInt("Enter Student ID: ");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
        } while (studentId <= 0);

        do {
            try {
                finalGrade = KeyboardReader.getPromptedInt("Enter Student Final Grade: ");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
        } while (finalGrade < 0 || finalGrade > 100);

        return new Student(firstName, lastName, studentId, finalGrade);
    }

    /**
     * Method to print out the report of classrooms and they're attributes
     * @param classrooms the classrooms in the list of classrooms
     */
    void report(ArrayList<Displayable> classrooms) {
        for (Displayable classroom : classrooms) {
            System.out.println("\n-------------------------------------------");
            System.out.println(classroom.display());
            System.out.println("-------------------------------------------\n");
        }
    }

    /**
     * Method to add a classroom and prompt user if they would like to add another additional classroom
     */
    public PrintReports() {
        classrooms = new ArrayList<>();
        char choice;
        do {
            classrooms.add((Classroom) enterClassroom());
            choice = KeyboardReader.getPromptedChar("Enter Another Classroom? (Y/N): ");
            choice = Character.toUpperCase(choice);
        } while (choice == 'Y');
        report(classrooms);
    }
}

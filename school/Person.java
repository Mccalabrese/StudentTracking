package school;

/**
 *  Represents a Person, which will encompass both students and teachers
 */
public abstract class Person {

    /**
     * The Person's first name
     */
    private String firstName;

    /**
     * The Person's last name
     */
    private String lastName;

    /**
     * Default empty constructor, creates a person instance.
     */
    public Person() {
    }

    /**
     * Constructor, creates a person instance.
     * @param firstName the person's first name
     * @param lastName the person's last name
     */
    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    /**
     * Retrieves the first name of the person
     * @return the person's first name
     */
    public String getFirstName() { return firstName; }

    /**
     * Sets the first name of the person.
     * @param firstName the first name of the person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retrieves the last name of the person
     * @return the person's last name
     */
    public String getLastName() { return lastName; }

    /**
     * Sets the last name of the book.
     * @param lastName the last name of the person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retrieves the full name of the person
     * @return the person's full name
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
}

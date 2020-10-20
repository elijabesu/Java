package parts.ten.streams;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public Person(String name, int birthYear) {
        this(name.split(" ")[0], name.split(" ")[1], birthYear);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        if (birthYear == 0) return firstName + " " + lastName;
        return firstName + " " + lastName + " (" + birthYear + ")";
    }
}

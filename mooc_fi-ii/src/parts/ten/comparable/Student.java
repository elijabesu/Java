package parts.ten.comparable;

public class Student implements Comparable<Student>, Identifiable {
    private String name;
    private String ID;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareToIgnoreCase(o.name);
    }

    @Override
    public String getID() {
        return ID;
    }
}

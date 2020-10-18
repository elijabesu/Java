package parts.nine.inheritance;

public class Subclass extends Superclass {
    public Subclass() {
        super("Subclass!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAnd some more.";
    }
}

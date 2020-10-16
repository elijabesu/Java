package parts.nine;

public class Superclass {
    private String objectVariable;

    public Superclass() {
        this("Example");
    }

    public Superclass(String value) {
        this.objectVariable = value;
    }

    @Override
    public String toString() {
        return this.objectVariable;
    }
}

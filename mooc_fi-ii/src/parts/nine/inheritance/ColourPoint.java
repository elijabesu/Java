package parts.nine.inheritance;

public class ColourPoint extends Point {
    private String colour;

    public ColourPoint(int x, int y, String colour) {
        super(x, y);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + ", colour " + colour;
    }
}

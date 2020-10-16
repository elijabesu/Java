package parts.nine;

public class Engine extends Part {      // Engine inherits the functionality of the class Part
    private String engineType;

    public Engine(String identifier, String manufacturer, String description, String engineType) {
        super(identifier, manufacturer, description); // calls the constructor in Part
        // works the same as calling this classes' constructor using this()
        this.engineType = engineType;
    }
    /*
    If a constructor uses the constructor of the superclass by calling super in it, the super call must be on the first
    line of the constructor.
     */

    public String getEngineType() {
        return engineType;
    }
}

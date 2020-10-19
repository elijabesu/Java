package parts.nine.polymorphism;

public class Main {
    public static void main(String[] args) {
        //testOrganism();
        testHerd();
    }

    /*
    Any given object can be represented as a Object-type variable in addition to its own type.

    In Java, each class can inherit one class at most. On the other hand, the inherited class may have inherited
    another class. As such, a class may indirectly inherit more than a single class.

    INHERITANCE == types of the object
    INTERFACES == also types of the object

    String class' inheritance:
        java.lang.Object
            java.lang.String

    String class' implemented interfaces:
        Serializable, CharSequence, Comparable<String>

    Meaning that all strings are of these types: String, Object, Serializable, CharSequence, Comparable<String>


    Since we're able to define the type of a method's parameter, we can declare methods that receive an object that
    implements a specific interface. When a method's parameter is an interface, any object that implements that
    interface can be passed to it as an argument.
     */

    public static void testOrganism() {
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);
    }

    public static void testHerd() {
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);
    }
}

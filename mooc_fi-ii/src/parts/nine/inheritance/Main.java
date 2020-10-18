package parts.nine.inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //testEngine();
        //testSubclass();
        //testPerson();
        //testPrintPersons();
        //testToString();
        //testPoints();
        //testWarehouse();
        //testHistoryWarehouse();
        testBox();
    }

    /*
    An essential idea behind object-oriented programming is that solutions rise from the interactions between objects
    which are created from classes. An object in object-oriented programming is an independent unit that has a state,
    which can be modified by using the methods that the object provides. Objects are used in cooperation; each has its
    own area of responsibility.

    Each class can directly extend only one class. However, a class indirectly inherits all the properties of the
    classes it extends.

    You use the keyword /extends/ to inherit the properties of a class. The class that receives the properties is
    called the subclass, and the class whose properties are inherited is called the superclass.
    */

    public static void testEngine() {
        Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(engine.getEngineType());
        System.out.println(engine.getManufacturer());
    }

    /*
    If a method or variable has the access modifier /private/, it is visible only to the internal methods of that class.
    Subclasses will not see it, and a subclass has no direct means to access it. So, from the Engine class there is no
    way to directly access the variables identifier, manufacturer, and description, which are defined in the superclass
    Part.

    A subclass sees everything that is defined with the /public/ modifier in the superclass.

    If we want to define some variables or methods that are visible to the subclasses but invisible to everything else,
    we can use the access modifier /protected/ to achieve this.
     */

    public static void testSubclass() {
        Superclass sup = new Superclass();
        Subclass sub = new Subclass();

        System.out.println(sup);
        System.out.println(sub);
    }

    public static void testPerson() {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);

        Teacher ada2 = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko2 = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada2);
        System.out.println(esko2);

        Student ollie2 = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            ollie2.study();
            i = i + 1;
        }
        System.out.println(ollie2);
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person: persons) {
            System.out.println(person);
        }
    }

    public static void testPrintPersons() {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }

    /*
    An object's type decides what the methods provided by the object are. For instance, we implemented the class
    Student earlier. If a reference to a Student type object is stored in a Person type variable, only the methods
    defined in the Person class (and its superclass and interfaces) are available:
     */
    public static void studentInPerson() {
        Person ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        // ollie.credits();        // DOESN'T WORK!
        // ollie.study();              // DOESN'T WORK!
        System.out.println(ollie);   // ollie.toString() WORKS
    }
    /*
    So an object has at its disposal the methods that relate to its type, and also to its superclasses and interfaces.
    The Student object above offers the methods defined in the the classes Person and Object.

    In the last exercise we wrote a new toString implementation for Student to override the method that it inherits
    from Person. The class Person had already overriden the toString method it inherited from the class Object. If we
    handle an object by some other type than its actual type, which version of the object's method is called?
     */
    public static void testToString() {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        Person olliePerson = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(olliePerson);
        Object ollieObject = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollieObject);

        Object alice = new Student("Alice", "177 Stewart Ave. Farmington, ME 04938");
        System.out.println(alice);
    }
    /*
    The method to be executed is chosen based on the actual type of the object, which means the class whose constructor
    is called when the object is created.

        // POLYMORPHISM //
        Regardless of the type of the variable, the method that is executed is always chosen based on the actual type
        of the object. Objects are polymorphic, which means that they can be used via many different variable types.
        The executed method always relates to the actual type of the object. This phenomenon is called polymorphism.
     */

    public static void testPoints() {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4, 8));
        points.add(new ColourPoint(1, 1, "green"));
        points.add(new ColourPoint(2, 5, "blue"));
        points.add(new Point3D(5, 2, 8));
        points.add(new Point(0, 0));

        for (Point p: points) {
            System.out.println(p);
        }
    }

    public static void testWarehouse() {
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        System.out.println(juice);
    }

    public static void testHistoryWarehouse() {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        System.out.println(juice.getAnalysis());
    }

        // ABSTRACT CLASS //
    /*
    Sometimes, when planning a hierarchy of inheritance, there are cases when there exists a clear concept, but that
    concept is not a good candidate for an object in itself. The concept would be beneficial from the point of view of
    inheritance, since it includes variables and functionality that are shared by all the classes that would inherit it.
    On the other hand, you should not be able to create instances of the concept itself.

    An abstract class combines interfaces and inheritance. You cannot create instances of them — you can only create
    instances of subclasses of an abstract class. They can include normal methods which have a method body, but it's
    also possible to define abstract methods that only contain the method definition. Implementing the abstract methods
    is the responsibility of subclasses. Generally, abstract classes are used in situations where the concept that the
    class represents is not a clear independent concept. In such a case you shouldn't be able to create instances of it.

    To define an abstract class or an abstract method the keyword /abstract/ is used.
     */

    public static void testBox() {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        System.out.println();

        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));

        System.out.println();

        MisplacingBox box2 = new MisplacingBox();
        box2.add(new Item("Saludo", 5));
        box2.add(new Item("Pirkka", 5));

        System.out.println(box2.isInBox(new Item("Saludo")));
        System.out.println(box2.isInBox(new Item("Pirkka")));
    }
}

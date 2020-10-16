package parts.nine;

import java.util.ArrayList;

public class Inheritance {
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
}

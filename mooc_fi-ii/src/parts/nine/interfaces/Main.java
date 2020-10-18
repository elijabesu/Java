package parts.nine.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //testReadable();
        owo();
    }

    /*
    We can use interfaces to define behavior that's required from a class, i.e., its methods. They're defined the same
    way that regular Java classes are, but /public interface .../ is used instead of public class ... at the beginning
    of the class. Interfaces define behavior through method names and their return values. However, they don't always
    include the actual implementations of the methods. A visibility attribute on interfaces is not marked explicitly
    as they're always public.

    The classes that implement the interface decide how the methods defined in the interface are implemented. A class
    implements the interface by adding the keyword /implements/ after the class name followed by the name of the
    interface being implemented.

        // An Interface Is a Contract of Behaviour //
        When a class implements an interface, it signs an agreement. The agreement dictates that the class will
        implement the methods defined by the interface. If those methods are not implemented in the class, the program
        will not function.

        The interface defines only the names, parameters, and return values of the required methods. The interface,
        however, does not have a say on the internal implementation of its methods. It is the responsibility of the
        programmer to define the internal functionality for the methods.
     */

    public static void testReadable() {
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming.", pages);

        int page = 0;
        while (page < book.pages()) {
            System.out.println(book.read());
            page = page + 1;
        }
    }

    /*
    An object's type can be other than its class. For example, the type of the Ebook class that implements the Readable
    interface is both Ebook and Readable. Similarly, the text message also has multiple types. Because the TextMessage
    class implements the Readable interface, it has a Readable type in addition to the TextMessage type.

    Because an interface can be used as a type, it's possible to create a list that contains objects of the interfaces.
    The true benefits of interfaces are reaped when they are used as the type of parameter provided to a method. Since
    an interface can be used as a variable's type, it can also be used as a parameter type in method calls.
     */

    public static void owo() {
        ArrayList<Readable> readingList = new ArrayList<>();

        readingList.add(new TextMessage("ope", "never been programming before..."));
        readingList.add(new TextMessage("ope", "gonna love it i think!"));
        readingList.add(new TextMessage("ope", "give me something more challenging! :)"));
        readingList.add(new TextMessage("ope", "you think i can do it?"));
        readingList.add(new TextMessage("ope", "up here we send several messages each day"));


        ArrayList<String> pages = new ArrayList<>();
        pages.add("A method can call itself.");

        readingList.add(new Ebook("Introduction to Recursion.", pages));

        for (Readable readable: readingList) {
            System.out.println(readable.read());
        }
    }

    /*
    For example, the print method in the Printer class of the class below gets a variable of type read.

    public class Printer {
        public void print(Readable readable) {
            System.out.println(readable.read());
        }
    }

    The value of the print method of the printer class lies in the fact that it can be given any class that implements
    the Readable interface as a parameter. Were we to call the method with any object instantiated from a class that
    inherits the Readable class, the method would function as desired.
     */
}

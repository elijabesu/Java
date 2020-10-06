package com.saurichable;

import java.util.ArrayList;
import java.util.Scanner;

public class OOP {
    /*
    Object-oriented programming is concerned with isolating concepts of a problem domain into separate entities and
    then using those entities to solve problems.

    A class defines the attributes of objects - the information related to them (instance variables), and their
    commands - their methods. The values of instance (object) variables define the internal state of an individual
    object, whereas methods define the functionality it offers.

    A Method is a piece of source code written inside a class that's been named and has the ability to be called.
    A method is always part of some class and is often used to modify the internal state of an object instantiated from
    a class.

    An object is always instantiated by calling a method that created an object, a constructor, by using the new keyword.

    A class lays out a blueprint for any objects that are instantiated from it. Individual objects are all created
    based on the same blueprints - they're instances of the same class. The states of individual objects, their
    attributes, may all vary, however.

    Variables defined inside a class are called /instance variables/, or object fields or object attributes.

    The keyword /private/ means that the variables are "hidden" inside the object. This is known as /encapsulation/.

    A constructor is defined after the instance variables. The name is always the same as the class name.
    A constructor can be called from another constructor using the /this/ keyword.
    A class may have multiple constructors.

    If the programmer does not define a constructor for a class, Java automatically creates a default one for it.
    A default constructor is a constructor that doesn't do anything apart from creating the object.

    A method is written inside of the class beneath the constructor.

    Having methods that print something is bad. A preferred way is to define a method for the object that returns
    a "string representation" of the object. The method returning the string representation is always toString in Java.

    The keyword /void/ means that the method does not return a value.

    If we want the method to return a value, we need to replace the void keyword with the type of the variable to be
    returned.

    The /static/ modifier indicates that the method in question does not belong to an object and thus cannot be used
    to access any variables that belong to objects.

    Our methods will not include the static keyword if they're used to process information about objects created from
    a given class.

    If a method receives as parameters all the variables whose values it uses, it can have a static modifier.
     */

    /*
        Objects in a list
    Handling objects in a list is not really different in any way from the previous experience we have with lists.
     */
    public static void objectsInList() {
        ArrayList<Person> people = new ArrayList<>();
        Person john = new Person("John");
        people.add(john);
        people.add(new Person("Matthew")); // can be created while being added
        people.add(new Person("Martin"));

        for (Person person: people){
            System.out.println(person);
        }
    }
    public static void userInputObjectsInList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        System.out.println("Enter names:");
        while (true){
            String name = scanner.nextLine();
            if (name.isEmpty()){ break; }
            people.add(new Person(name));
        }
        System.out.println();
        System.out.println("Total people added: " + people.size());
        System.out.println("People added:");
        for (Person person: people){
            System.out.println(person);
        }
    }

    public static void userInputBooksList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();
        System.out.println("Enter data in the following format:");
        System.out.println("title; number of pages; publication year");
        while (true) {
            String data = scanner.nextLine();
            if (data.isEmpty()) { break; }
            String[] splitData = data.split("; ");
            String title = splitData[0];
            int pages = Integer.valueOf(splitData[1]);
            int year = Integer.valueOf(splitData[2]);
            Books newBook = new Books(title, pages, year);
            if (books.contains(newBook)) {
                System.out.println("This book has already been added.");
            } else {
                books.add(newBook);
            }
        }
        System.out.print("What information should be printed? ");
        String toPrint = scanner.nextLine();
        for (Books book: books) {
            if (toPrint.equals("everything") || toPrint.equals("all")) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getYear());
            } else if (toPrint.equals("name") || toPrint.equals("title")) {
                System.out.println(book.getTitle());
            } else {
                System.out.println("Unknown. Cancelling, fuck you lol.");
            }
        }
    }

    /*
    Object-oriented programming is primarily about isolating concepts into their own entities or, in other words,
    creating abstractions. Separating a concept into its own class is a good idea for many reasons. Firstly, certain
    details can be hidden inside the class (abstracted).

    An /Object/ refers to an independent entity that contains both data (instance variables) and behavior (methods).
    Objects interact with one another through method calls — these method calls are used to both request information
    from objects and give instructions to them. Each object hides its internal operations, providing access to its
    functionality through clearly defined methods. Moreover, the object is independent of any other object that it
    doesn't require to accomplish its task.

    A /class/ defines the types of objects that can be created from it. It contains instance variables describing the
    object's data, a constructor or constructors used to create it, and methods that define its behavior. Objects are
    created from the class through constructors by using the new command.

    The technique of having two (or more) constructors in a class is known as /constructor overloading/. A class can
    have multiple constructors that differ in the number and/or type of their parameters. It's not, however, possible
    to have two constructors with the exact same parameters.

    Methods can be overloaded in the same way as constructors - multiple versions of a given method can be created.
    Once again, the parameters of the different versions must be different.
     */

    /*
    Variables in Java are classified into primitive and reference variables. From the programmer's perspective,
    a primitive variable's information is stored as the value of that variable, whereas a reference variable holds
    a reference to information related to that variable. Reference variables are practically always objects in Java.
    The value of a primitive variable is concrete, whereas the value of a reference variable is a reference.

    When we attempt to print the value of a reference variable, the output contains the type of the variable and
    an identifier created for it by Java: the string Name@4aa298b7 tells us that the given variable is of type Name
    and its identifier is 4aa298b7.

    PRIMITIVE VARIABLES
    Java has eight different primitive variables:
        boolean (a truth value: either true or false)
        byte (a byte containing 8 bits, between the values -128 and 127)
        char (a 16-bit value representing a single character)
        short (a 16-bit value that represents a small integer, between the values -32768 and 32767)
        int (a 32-bit value that represents a medium-sized integer, between the values -2^31 and -1+2^31)
        long (a 64-bit value that represents a large integer, between values -2^63 and -1+2^63)
        float (a floating-point number that uses 32 bits)
        double (a floating-point number that uses 64 bits)

    Declaring a primitive variable causes the computer to reserve some memory where the value assigned to the variable
    can be stored. The size of the storage container reserved depends on type of the primitive.

    The values of variables are also copied whenever they're used in method calls. What this means in practice is that
    the value of a variable that's passed as a parameter during a method call is not mutated in the calling method by
    the method called.

    REFERENCE VARIABLES
    All of the variables provided by Java (other than the eight primitive variables above) are reference type.
    A programmer is also free to create their own variable types by defining new classes. In practice, any object
    instanced from a class is a reference variable. The value of a reference variable — the reference — points to
    a location that contains information relating to the given variable.

    The most significant difference between primitive and reference variables is that primitives (usually numbers) are
    immutable. The internal state of reference variables, on the other hand, can typically be mutated.

    Assigning a reference type variable copies the reference.

    METHOD PARAMETERS
    Regardless of whether the variable is primitive or reference type, the value passed to the method as an argument is
    copied for the called method to use. With primitive variables, the value of the variable is conveyed to the method.
    With reference variables, it's a reference.

    NULL
    The null reference can be set as the value of any reference type variable. If an object is referred to by nobody,
    it becomes "garbage". In the Java programming language the programmer need not worry about the program's memory use.
    From time to time, the automatic garbage collector of the Java language cleans up the objects that have become
    garbage. If the garbage collection did not happen, the garbage objects would reserve a memory location until the
    end of the program execution.

    .EQUALS()
    The method /equals/ is similar to the method toString in the respect that it is available for use even if it has
    not been defined in the class. The default implementation of this method compares the equality of the references.
    If we want to be able to compare two objects of our own design with the equals method, that method must be defined
    in the class. The equals method is implemented in such a way that it can be used to compare the current object with
    any other object. The method receives an Object-type object as its single parameter — all objects are Object-type,
    in addition to their own type.

    The /contains/ method of a list uses the equals method that is defined for the objects in its search for objects.
     */

    public void userInputArchive(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        while (true) {
            System.out.print("Identifier? ");
            String id = scanner.nextLine();
            if (id.isEmpty()) { break; }

            System.out.print("Name? ");
            String name = scanner.nextLine();
            if (name.isEmpty()) { break; }

            Archive newArchive = new Archive(id, name);

            if (archives.contains(newArchive)) { continue; }
            else { archives.add(newArchive); }
        }
        System.out.println();
        System.out.println("== ITEMS ==");
        if (archives.size() == 0) { System.out.println("Nothing is here."); }
        else {
            for (Archive archive: archives) {
                System.out.println(archive);
            }
        }
    }
}

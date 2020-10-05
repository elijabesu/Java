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
     */

    // rest in Persons.java

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
            books.add(new Books(title, pages, year));
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
}

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
}

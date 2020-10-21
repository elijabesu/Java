package parts.ten.comparable;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //sortClubMembers();
        //sortPeople();
        literacyComparison();
    }

    /*
    The Comparable interface defines the `compareTo` method used to compare objects. If a class implements the
    Comparable interface, objects created from that class can be sorted using Java's sorting algorithms.

    The compareTo method required by the Comparable interface receives as its parameter the object to which the "this"
    object is compared. If the "this" object comes before the object received as a parameter in terms of sorting order,
    the method should return a negative number. If, on the other hand, the "this" object comes after the object received
    as a parameter, the method should return a positive number. Otherwise, 0 is returned. The sorting resulting from
    the compareTo method is called natural ordering.

    Since the ClubMember class implements the Comparable interface, it is possible to sort the list by using the sorted
    method. In fact, objects of any class that implement the Comparable interface can be sorted using the sorted method.
    Be aware, however, that a stream does not sort the original list - only the items in the stream are sorted.

    If a programmer wants to organize the original list, the sort method of the Collections class should be used. This
    assumes that the objects on the list implement the Comparable interface.
     */

    public static void sortClubMembers() {
        List<ClubMember> member = new ArrayList<>();
        member.add(new ClubMember("mikael", 182));
        member.add(new ClubMember("matti", 187));
        member.add(new ClubMember("ada", 184));

        member.stream().forEach(m -> System.out.println(m));
        System.out.println();
        member.stream().sorted().forEach(m -> System.out.println(m));
        System.out.println();
        member.stream().forEach(m -> System.out.println(m));
        System.out.println();
        // sorting a list with the sort-method of the Collections class
        Collections.sort(member);
        member.stream().forEach(m -> System.out.println(m));
    }

    /*
        // Implementing Multiple Interfaces //
    A class can implement multiple interfaces. Multiple interfaces are implemented by separating the implemented
    interfaces with commas (public class ... implements *FirstInterface*, *SecondInterface* ...). Implementing multiple
    interfaces requires us to implement all of the methods for which implementations are required by the interfaces.

    See aka Student class
     */

    /*
        // Sorting Method as a Lambda Expression //
    Both the `sort` method of the `Collections` class and the stream's `sorted` method accept a lambda expression as
    a parameter that defines the sorting criteria. More specifically, both methods can be provided with an object that
    implements the Comparator interface, which defines the desired order - the lambda expression is used to create
    this object.
     */

    public static void sortPeople() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ada Lovelace", 1815));
        people.add(new Person("Irma Wyman", 1928));
        people.add(new Person("Grace Hopper", 1906));
        people.add(new Person("Mary Coombs", 1929));

        people.stream().sorted((p1, p2) -> {
            return p1.getBirthYear() - p2.getBirthYear();
        }).forEach(person -> System.out.println(person.getName()));

        System.out.println();
        people.stream().forEach(person -> System.out.println(person.getName()));

        System.out.println();
        Collections.sort(people, (p1, p2) -> p1.getBirthYear() - p2.getBirthYear());
        people.stream().forEach(person -> System.out.println(person.getName()));
    }

    public static void literacyComparison() {
        try {
            Files.lines(Paths.get(System.getProperty("user.dir") + "\\files\\literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((p1, p2) -> Double.compare(Double.valueOf(p1[5]), Double.valueOf(p2[5])))
                    .forEach(parts -> System.out.println(parts[3] + " (" + parts[4] + "), " + parts[2].trim().replace(" (%)","")
                            + ", " + parts[5]));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

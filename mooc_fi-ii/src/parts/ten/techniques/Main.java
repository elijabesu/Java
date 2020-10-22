package parts.ten.techniques;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //checkStudentIDFormat();
        //checker();
        //enumCard();
        employees();
    }

    /*
        // StringBuilder //
    String creation - although unnoticeable at a small scale - is not a quick operation. Space is allocated in memory
    for each string where the string is then placed. If the string is only needed as part of creating a larger string,
    performance should be improved.

    Java's ready-made StringBuilder class provides a way to concatenate strings without the need to create them. A new
    StringBuilder object is created with a new StringBuilder() call, and content is added to the object using the
    overloaded append method, i.e., there are variations of it for different types of variables. Finally, the
    StringBuilder object provides a string using the toString method.

    Using StringBuilder is more efficient than creating strings with the + operator.
     */

    public static void createStringWithPluses() {
        ArrayList<String> words = new ArrayList<>();
        words.add("first");
        words.add("second");
        words.add("third");

        String connectedString = "";
        for (int i = 0; i < words.size(); i++) {
            connectedString = connectedString + words.get(i);
        }
        System.out.println(connectedString); // created 7 strings
    }

    public static void createStringWithStringBuilder() {
        ArrayList<String> words= new ArrayList<>();
        words.add("first");
        words.add("second");
        words.add("third");

        StringBuilder connectedString = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            connectedString.append(words.get(i));
        }
        System.out.println(connectedString.toString()); // created 4 strings
    }

    /*
        // Regular Expressions //
    A regular expression defines a set of strings in a compact form. Regular expressions are used, among other things,
    to verify the correctness of strings. We can assess whether or not a string is in the desired form by using
    a regular expression that defines the strings considered correct.

    Checking correctness with the help of regular expressions is done by first defining a suitable regular expression.
    We can then use the matches method of the String class, which checks whether the string matches the regular
    expression given as a parameter.
     */

    public static void checkStudentIDFormat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a student number: ");
        String number = scanner.nextLine();

        if (number.matches("01[0-9]{7}")) { // starts with 01, then 7 numbers between 0 and 9
            System.out.println("Correct format.");
        } else {
            System.out.println("Incorrect format.");
        }
    }

    /*
    Let's go through the most common characters used in regular expressions.

            /// Alternation (Vertical Line) ///
        A vertical line indicates that parts of a regular expressions are optional. For example, 00|111|0000 defines
        the strings 00, 111 and 0000. The respond method returns true if the string matches any one of the specified
        group of alternatives. The regular expression 00|111|0000 demands that the string is exactly it specifies it to
        be - there is no "contains" functionality.

            /// Affecting Part of a String (Parentheses) ///
        You can use parentheses to determine which part of a regular expression is affected by the rules inside the
        parentheses. Say we want to allow the strings 00000 and 00001. We can do that by placing a vertical bar in
        between them this way 00000|00001. Parentheses allow us to limit the option to a specific part of the string.
        The expression 0000(0|1) specifies the strings 00000 and 00001. Similarly, the regular expression car(|s|)
        defines the singular (car) and plural (cars) forms of the word car.

            /// Quantifiers ///
        What is often desired is that a particular sub-string is repeated in a string. The following expressions are
        available in regular expressions:
            - the quantifier * repeats at least 0 times;
            - the quantifier + repeats at least 1 time;
            - the quantifier ? repeats 0 or 1 times;
            - the quantifier {x} repeats x times;
            - the quantifier {x, y} repeats x to y times;
            - the quantifier {x, } repeats at least x times.
        You can use more than one quantifier in a single regular expression. For example, the regular expression
        5{3}(1|0)*5{3} defines strings that begin and end with three fives. An unlimited number of ones and zeros are
        allowed in between.

            /// Character Classes (Square Brackets) ///
        A character class can be used to specify a set of characters in a compact way. Characters are enclosed in
        square brackets, and a range is indicated with a dash. For example, [145] means (1|4|5) and [2-36-9] means
        (2|3|6|7|8|9). Similarly, the entry [a-c]* defines a regular expression that requires the string to contain
        only a, b and c.
     */

    public static void checker() {
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();
        while (true) {
            System.out.print("DAY: ");
            String day = scanner.nextLine();
            if (day.isEmpty()) break;
            if (checker.isDayOfWeek(day)) System.out.println("The form is correct.");
            else System.out.println("The form is incorrect.");
            System.out.println();

            System.out.print("VOWEL: ");
            String vowel = scanner.nextLine();
            if (vowel.isEmpty()) break;
            if (checker.allVowels(vowel)) System.out.println("The form is correct.");
            else System.out.println("The form is incorrect.");
            System.out.println();

            System.out.print("TIME: ");
            String time = scanner.nextLine();
            if (time.isEmpty()) break;
            if (checker.timeOfDay(time)) System.out.println("The form is correct.");
            else System.out.println("The form is incorrect.");
            System.out.println();
        }
    }

    /*
        // Enumerated Type - Enum //
    If we know the possible values of a variable in advance, we can use a class of type enum, i.e., enumerated type to
    represent the values. Enumerated types are their own type in addition to being normal classes and interfaces.
    An enumerated type is defined by the keyword enum.

    In its simplest form, enum lists the constant values it declares, separated by a comma. Enum types, i.e., constants,
    are conventionally written with capital letters.
        * see Suit.java
     */

    public static void enumCard() {
        Card first = new Card(10, Suit.HEART);

        System.out.println(first);

        if (first.getSuit() == Suit.SPADE) {
            System.out.println("is a spade");
        } else {
            System.out.println("is not a spade");
        }
    }

    /*
        Comparing Enums
    Each enum field gets a unique number code, and they can be compared using the equals sign. Just as other classes in
    Java, these values also inherit the Object class and its equals method. The equals method compares this numeric
    identifier in enum types too.

    The numeric identifier of an enum field value can be found with ordinal(). The method actually returns an order
    number - if the enum value is presented first, its order number is 0. If its second, the order number is 1, etc.

        // Object References In Enums //
    Enumerated types may contain object reference variables. The values of the reference variables should be set in
    an internal constructor of the class defining the enumerated type, i.e., within a constructor having a private
    access modifier. Enum type classes cannot have a public constructor.
        * see Colour.java

        // Iterator //
    ArrayList and other "object containers" that implement the Collection interface implement the Iterable interface,
    and they can also be iterated over with the help of an iterator - an object specifically designed to go through
    a particular type of object collection.
        * see Hand.java

    The iterator can be thought of as a "finger" that always points to a particular object inside the list. Initially
    it points to the first item, then to the next, and so on... until all the objects have been gone through with the
    help of the "finger".

    The iterator offers a few methods. The hasNext() method is used to ask if there are any objects still to be
    iterated over. If there are, the next object in line can be requested from the iterator using the next() method.
    This method returns the next object in line to be processed and moves the iterator, or "finger", to point to th
    following object in the collection.
     */

    public static void employees() {
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
}

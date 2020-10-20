package parts.ten.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //inputStats();
        //inputPositiveNegative();
        //testStreamMethods();
        //testPositive();
        //testTerminal();
        //testDivisible();

        //printingUserInput();
        //limitedNumbers();
        //uniqueLastNames();

        //presidents();
        System.out.println(books("books.txt"));
    }

    /*
    Let's get to know collections, such as lists, as streams of values. Stream is a way of going through a collection
    of data such that the programmer determines the operation to be performed on each value. No record is kept of the
    index or the variable being processed at any given time.

    With streams, the programmer defines a sequence of events that is executed for each value in a collection. An event
    chain may include dumping some of the values, converting values from one form to another, or calculations. A stream
    does not change the values in the original data collection, but merely processes them. If you want to retain the
    transformations, they need to be compiled into another data collection.

    A stream can be formed from any object that implements the Collection interface (e.g., ArrayList, HashSet, HashMap,
    ...) with the /stream()/ method.
     */

    public static void inputStats() {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        System.out.println("Enter numbers:");

        while (true) {
            String row = scanner.nextLine();
            if (row.isEmpty()) break;
            inputs.add(row);
        }

        long numbersDivisibleByTwo = inputs.stream().mapToInt(n -> Integer.valueOf(n)).filter(n -> n % 2 == 0).count();
        double average = inputs.stream().mapToInt(n -> Integer.valueOf(n)).average().getAsDouble();

        System.out.println("Divisible by two: " + numbersDivisibleByTwo);
        System.out.println("Average: " + average);
     }

    public static void inputPositiveNegative() {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        System.out.println("Enter numbers:");

        while (true) {
            String row = scanner.nextLine();
            if (row.isEmpty()) break;
            inputs.add(row);
        }

        double average = 0;
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        if (choice.equals("p")) {
            average = inputs.stream().mapToInt(n -> Integer.valueOf(n)).filter(n -> n > 0).average().getAsDouble();
        } else if (choice.equals("n")) {
            average = inputs.stream().mapToInt(n -> Integer.valueOf(n)).filter(n -> n < 0).average().getAsDouble();
        }

        System.out.println("Average: " + average);
    }

    /*
        // Lambda Expressions //
    Stream values are handled by methods related to streams. Methods that handle values get a function as a parameter
    that determines what is done with each element. What the function does is specific to the method in question.
    For instance, the filter method used for filtering elements is provided a function which returns the a boolean
    true or false, depending on whether to keep the value in the stream or not. The mapToInt method used for
    transformation is, on the other hand, provided a function which converts the value to an integer, and so on.

    Why are the functions written in the form value -> value > 5?

    The expression above, i.e., a lambda expression, is shorthand provided by Java for anonymous methods that do not
    have an "owner", i.e., they are not part of a class or an interface. The function contains both the parameter
    definition and the function body. The same function can be written in several different ways.

        *stream*.filter(value -> value > 5).*furtherAction*

        *stream*.filter((Integer value) -> {
            if (value > 5) {
                return true;
            }
            return false;
        }).*furtherAction*

    The same can be written explicitly so that a static method is defined in the program, which gets used within the
    function passed to the stream as a parameter.

        public class Screeners {
            public static boolean greaterThanFive(int value) {
                return value > 5;
            }
        }

        *stream*.filter(value -> Screeners.greaterThanFive(value)).*furtherAction*

    The function can also be passed directly as a parameter. The syntax found below Screeners::greaterThanFive is
    saying: "use the static greaterThanFive method that's in the Screeners class".

        *stream*.filter(Screeners::greaterThanFive).*furtherAction*

    Functions that handle stream elements cannot change values of variables outside of the function. This has to do
    with how static methods behave - during a method call, there is no access to any variables outside of the method.
    With functions, the values of variables outside the function can be read, assuming that those values of those
    variables do not change in the program.
     */

    /*
        // Stream Methods //
    Stream methods can be roughly divided into two categories:
        (1) intermediate operations intended for processing elements;
        (2) terminal operations that end the processing of elements.
    Both of the filter and mapToInt methods shown in the previous example are intermediate operations. Intermediate
    operations return a value that can be further processed - you could, in practice, have an infinite number of
    intermediate operations chained sequentially (& separated by a dot). On the other hand, the average method seen
    in the previous example is a terminal operation. A terminal operation returns a value to be processed, which is
    formed from, for instance, stream elements.
     */

    public static void testStreamMethods() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(6);

        ArrayList<Integer> values = list.stream()
                .filter(value -> value > 5)
                .map(value -> value * 2)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(values);
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(number -> number > 0).collect(Collectors.toList());
    }

    public static void testPositive() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-2);
        list.add(4);
        list.add(2);
        list.add(6);
        list.add(-6);
        list.add(-1);
        System.out.println(positive(list));
    }

    /*
        // Terminal Operations //
    Let's take a look at four terminal operations:
         - count -- for counting the number of values on a list;
         - forEach -- for going a through list values;
         - collect -- for gathering the list values into a data structure;
         - reduce -- for combining the list items.
     */

    public static void testTerminal() {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(17);
        values.add(6);
        values.add(8);

        // The count method informs us of the number of values in the stream as a long-type variable.
        System.out.println("Values: " + values.stream().count());

        // The forEach method defines what is done to each list value and terminated the stream processing.
        values.stream().filter(v -> v % 2 == 0).forEach(v -> System.out.println(v));

        // The reduce method is useful when you want to combine stream elements to some other form.
        // The parameters accepted by the method have the following format:
            // reduce(*initialState*, (*previous*, *object*) -> *actions on the object*).
        System.out.println(values.stream().reduce(0, (prevSum, value) -> prevSum + value));
    }
        // You can use the collect method to collect stream values into another collection.
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0 || n % 3 == 0 || n % 5 == 00)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void testDivisible() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(num -> System.out.println(num));
    }

    /*
        // Intermediate Operations //
    Intermediate stream operations are methods that return a stream. Since the value returned is a stream, we can call
    intermediate operations sequentially. Typical intermediate operations include converting a value from one form to
    another using /map/ and its more specific form /mapToInt/ used for converting a stream to an integer stream. Other
    ones include filtering values with /filter/, identifying unique values with /distinct/, and arranging values with
    /sorted/ (if possible).
     */

    public static void bornBefore() {
        ArrayList<Person> people = new ArrayList<>();   // assuming this is filled

        // print the number of persons born before the year 1970
        long count1917 = people.stream().filter(person -> person.getBirthYear() < 1970).count();
        System.out.println("number of persons born before the year 1970: " + count1917);

        // how many persons' first names start with the letter "A"
        long countA = people.stream().filter(person -> person.getFirstName().startsWith("A")).count();
        System.out.println("number of persons' first names start with the letter \"A\": " + countA);

        // print all unique first names in alphabetical order
        /* First we'll use the map method to change a stream containing person objects into a stream containing first
        names. After that we'll call the distinct-method, that returns a stream that only contains unique values. Next,
        we call the method sorted, which sorts the strings. Finally, we call the method forEach, that is used to print
        the strings. */
        people.stream().map(person -> person.getFirstName()).distinct().sorted().forEach(name -> System.out.println(name));
    }

    public static void printingUserInput() {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            strings.add(input);
        }
        strings.stream().forEach(string -> System.out.println(string));
    }

    public static void limitedNumbers() {
        List<Integer> ints = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) break;
            ints.add(input);
        }
        ints.stream().filter(number -> number > 0 && number < 6).forEach(number -> System.out.println(number));
    }

    public static void uniqueLastNames() {
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Continue person information input? (y/n)");
            String input = scanner.nextLine();
            if (input.equals("n")) break;
            if (!input.equals("y")) continue;
            System.out.print("First name: ");
            String first = scanner.nextLine();
            System.out.print("Last name: ");
            String last = scanner.nextLine();
            System.out.print("Birth year: ");
            int year = Integer.valueOf(scanner.nextLine());
            people.add(new Person(first, last, year));
            System.out.println();
        }
        System.out.println("Unique last names in alphabetical order:");
        people.stream()
                .map(person -> person.getLastName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));
    }

    /*
    Handling objects using stream methods is natural. Each stream method that deals with the stream's values also
    enables you to call methods related to values.
     */

    public static void averageAuthorYear(){
        ArrayList<Book> books = new ArrayList<>();   // assuming this is filled

        double averageYear = books.stream()
                .map(book -> book.getAuthor())
                .mapToInt(author -> author.getBirthYear())
                .average().getAsDouble();
        System.out.println("Average of the authors' birth years: " + averageYear);

        // the names of the authors of books with the word "Potter" in their titles are outputted
        books.stream().filter(book -> book.getTitle().contains("Potter"))
                .map(book -> book.getAuthor())
                .forEach(author -> System.out.println(author));

        // print "Author Name: Book" pairs arranged in alphabetical order
        books.stream()
                .map(book -> book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + ": " + book.getTitle())
                .sorted().forEach(name -> System.out.println(name));
    }

    /*
        // Files and Streams//
    Streams are also very handy in handling files. The file is read in stream form using Java's ready-made Files
    class. The `lines` method in the files class allows you to create an input stream from a file, allowing you to
    process the rows one by one. The `lines` method gets a path as its parameter, which is created using the `get`
    method in the Paths class. The `get` method is provided a string describing the file path.
     */

    public static List<String> read(String file) {
        List<String> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(row -> rows.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return rows;
    }

    public static void presidents() {
        List<Person> presidents = new ArrayList<>();
        try {
            Files.lines(Paths.get(System.getProperty("user.dir") + "\\src\\parts\\ten\\streams\\presidents.txt"))
                    .map(row -> row.split("; ")) // split the row into name and year
                    .filter(parts -> parts.length >= 2) // filter out empty rows
                    .map(parts -> new Person(parts[0], Integer.valueOf(parts[1]))) // convert parts into people
                    .forEach(person -> presidents.add(person)); // add each person into the list
            System.out.println(presidents);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    public static List<Book> books(String file) {
        List<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(System.getProperty("user.dir") + "\\src\\parts\\ten\\streams\\" + file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(parts -> new Book(parts[3], parts[0], Integer.valueOf(parts[2]), Integer.valueOf(parts[1])))
                    .forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return books;
    }
}

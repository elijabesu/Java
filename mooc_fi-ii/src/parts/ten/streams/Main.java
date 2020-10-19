package parts.ten.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inputStats();
        inputPositiveNegative();
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
}

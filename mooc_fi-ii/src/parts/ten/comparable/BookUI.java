package parts.ten.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookUI {
    Scanner scanner;
    List<Book> books;

    public BookUI() {
        scanner = new Scanner(System.in);
        books = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;

            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, age));

            System.out.println();
        }
        System.out.println("There are " + books.size() + " books in total.");
        System.out.println();
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getTitle);
        books.stream()
                .sorted(comparator)
                .forEach(book -> System.out.println(book));
    }
}

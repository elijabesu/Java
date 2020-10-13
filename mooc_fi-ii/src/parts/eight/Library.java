package parts.eight;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }
    public void addBook(Book book) {
        String title = this.sanitizeString(book.getTitle());
        if (!this.books.containsKey(title)) {
            this.books.put(title, book);
        }
    }
    public Book getBook(String title) {
        title = sanitizeString(title);
        return this.books.get(title);
    }
    public void removeBook(String title) {
        title = sanitizeString(title);
        if (this.books.containsKey(title)) {
            this.books.remove(title);
        }
    }
    public static String sanitizeString(String string) {
        if (string == null) { string = ""; }
        return string.toLowerCase().trim();
    }

    /*
    We can go through the values of a hash map by using a for-each loop on the set returned by the keySet() method of
    the hash map.
     */
    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = this.sanitizeString(titlePart);
        ArrayList<Book> bookList = new ArrayList<>();

        for (String bookTitle: this.books.keySet()) {
            if (bookTitle.contains(titlePart)) {
                bookList.add(this.books.get(bookTitle));
            }
        }
        return bookList;
    }
    /*
    The preceding functionality could also be implemented by going through the hash map's values. The set of values can
    be retrieved with the hash map's values() method. This set of values can also be iterated over with a for-each loop.
     */
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book: hashmap.values()) {
            System.out.println(book);
        }
    }
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book: hashmap.values()) {
            if (book.getTitle().contains(sanitizeString(text))) {
                System.out.println(book);
            }
        }
    }
}

package parts.eight;

import java.util.Objects;

public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    public String getTitle() { return this.title; }
    public int getPages() { return this.pages; }
    public int getYear() { return this.year; }

    public String toString() {
        return this.title + " (" + this.year + "), " + this.pages + " pages";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                year == book.year &&
                title.equals(book.title);
    }

    /*
    In addition to equals, the hashCode method can also be used for approximate comparison of objects. The method
    creates from the object a "hash code", i.e, a number, that tells a bit about the object's content. If two objects
    have the same hash value, they may be equal. On the other hand, if two objects have different hash values, they
    are certainly unequal.
     */

    @Override
    public int hashCode() {
        return Objects.hash(title, pages, year);
    }

}

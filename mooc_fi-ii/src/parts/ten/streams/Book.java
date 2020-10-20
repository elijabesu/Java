package parts.ten.streams;

public class Book {
    private Person author;
    private String title;
    private int pages;
    private int year;

    public Book(Person author, String title, int pages) {
        this(author, title, pages, 0);
    }

    public Book(Person author, String title, int pages, int year) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public Book(String author, String title, int pages, int year) {
        this.author = new Person(author.split(" ")[0], author.split(" ")[1], 0);
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public Person getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }
}

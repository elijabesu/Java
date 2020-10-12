package parts.eight;

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
    public boolean equals(Object compared) {
        if (this == compared) { return true; }
        if (!(compared instanceof Book)) { return false; }
        Book comparedBook = (Book) compared;
        if (this.title.equals(comparedBook.title) &&
                this.year == comparedBook.year &&
                this.pages == comparedBook.pages) {
            return true;
        }
        return false;
    }
    public String toString() {
        return this.title + " (" + this.year + "), " + this.pages + " pages";
    }
}

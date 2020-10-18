package parts.nine.interfaces;

import java.util.ArrayList;

public class Ebook implements Readable {
    private String name;
    private ArrayList<String> pages;
    private int pageNumber;

    public Ebook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }

    public String getName() {
        return name;
    }

    public int pages() {
        return pages.size();
    }

    @Override
    public String read() {
        String page = pages.get(pageNumber);
        nextPage();
        return page;
    }

    private void nextPage() {
        ++pageNumber;
        if (pageNumber == pages.size()) pageNumber = 0;
    }
}

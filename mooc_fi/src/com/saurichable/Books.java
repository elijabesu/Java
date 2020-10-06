package com.saurichable;

public class Books {
    private String title;
    private int pages;
    private int year;

    public Books(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public void setTitle(String title){ this.title = title; }
    public void setPages(int pages){ this.pages = pages; }
    public void setYear(int year){ this.year = year; }

    public String getTitle() { return this.title; }
    public int getPages() { return this.pages; }
    public int getYear() { return this.year; }

    public boolean equals(Object compared) {
        if (this == compared) { return true; }
        if (!(compared instanceof Books)) { return false; }
        Books comparedBook = (Books) compared;
        if (this.title.equals(comparedBook.title) &&
                this.year == comparedBook.year &&
                this.pages == comparedBook.pages) {
            return true;
        }
        return false;
    }
}

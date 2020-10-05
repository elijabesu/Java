package com.saurichable;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){ return this.day; }
    public int getMonth(){ return this.month; }
    public int getYear(){ return this.year; }

    public String toString(){
        return this.year + "." + this.month + "." + this.day;
    }
}

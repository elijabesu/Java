package com.saurichable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
    public SimpleDate getToday() {
        return new SimpleDate(LocalDate.now().getDayOfMonth(),
                LocalDate.now().getMonthValue(),
                LocalDate.now().getYear());
    }
    public int getTodayDay() { return LocalDate.now().getDayOfMonth(); }
    public int getTodayMonth() { return LocalDate.now().getMonthValue(); }
    public int getTodayYear() { return LocalDate.now().getYear(); }

    public void todayDate(){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        System.out.println("Today is " + year + "." + month + "." + day);
        System.out.println(now.getMonth() + "\n" + now);
    }
    public void todayTime(){
        LocalTime now = LocalTime.now();
        System.out.println(now);
    }
    public void todayDateTime(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }

    public String toString(){
        return this.year + "." + this.month + "." + this.day;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) { return true; }
        if (this.year > compared.year) { return false; }

        if (this.month < compared.month) { return true; }
        if (this.month > compared.month) { return false; }

        if (this.day < compared.day) { return true; }
        return false;
    }

    public boolean equals(Object compared){
        if (this == compared) { return true; } // same position
        if (!(compared instanceof SimpleDate)) { return false; } // if they are different types
        SimpleDate comparedSimpleDate = (SimpleDate) compared; // convert the Object type into a SimpleDate type
        if (this.day == comparedSimpleDate.day &&
                this.month == comparedSimpleDate.month &&
                this.year == comparedSimpleDate.year) {
            return true;
        }
        return false;
    }
}

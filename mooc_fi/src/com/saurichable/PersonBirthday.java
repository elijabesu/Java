package com.saurichable;

public class PersonBirthday {
    private String name;
    private SimpleDate birthday;
    private double height;
    private double weight;

    public PersonBirthday(String name){
        this(name, 0, 0, 0);
    }
    public PersonBirthday(String name, SimpleDate birthday){
        this(name, birthday, 0, 0);
    }
    public PersonBirthday(String name, int day, int month, int year){
        this(name, new SimpleDate(day, month, year), 0, 0);
    }
    public PersonBirthday(String name, SimpleDate birthday, double height){
        this(name, birthday, height, 0);
    }
    public PersonBirthday(String name, SimpleDate birthday, double height, double weight){
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // Getters:
    public SimpleDate getBirthday(){ return this.birthday; }
    public String getName(){ return this.name; }
    public double getHeight() { return this.height; }
    public double getWeight(){ return this.weight; }

    // Setters:
    public void setBirthday(SimpleDate birthday){ this.birthday = birthday; }
    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }

    public boolean isOfLegalAge(){
        if (this.age >= 18) { return true; }
        else { return false; }
    }
    public double bodyMassIndex(){
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
    public double maximumHeartRate(){
        return 206.3 - (0.711 * this.age);
    }

    // do not do this:
    public void printPerson(){
        System.out.println(this.name + " is " + this.age + " years old.");
    }
    // do this instead:
    public String toString(){
        return this.name + " is " + this.age + " years old.";
    }
}

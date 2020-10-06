package com.saurichable;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name){
        this(name, 0, 0, 0);
    }
    public Person(String name, int age){
        this(name, age, 0, 0);
    }
    public Person(String name, double height){
        this(name, 0, height, 0);
    }
    public Person(String name, int age, double height){
        this(name, age, height, 0);
    }
    public Person(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void growOlder(){
        this.growOlder(1);
    }
    public void growOlder(int years) { this.age += years; }

    // Getters:
    public int getAge(){ return this.age; }
    public String getName(){ return this.name; }
    public double getHeight() { return this.height; }
    public double getWeight(){ return this.weight; }

    // Setters:
    public void setAge(int age){ this.age = age; }
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
        return this.name + " is " + this.height + "m tall.";
    }
}

package com.saurichable;

public class Person {
    // Variables defined inside a class are called /instance variables/, or object fields or object attributes.
    private String name;
    private int age;
    private int height;
    private int weight;
    // The keyword /private/ means that the variables are "hidden" inside the object. This is known as /encapsulation/.

    // A constructor is defined after the instance variables. The name is always the same as the class name.
    public Person(String initialName){
        /*
        this.age = 0; // sets the instance variable age of the newly created object (i.e., "this" object's age) to 0
        this.name = initialName;
        this.height = 0;
        this.weight = 0;
         */
        this(initialName, 0); // A constructor can be called from another constructor using the /this/ keyword.
    }
    /* If the programmer does not define a constructor for a class, Java automatically creates a default one for it.
    A default constructor is a constructor that doesn't do anything apart from creating the object. */

    // A class may have multiple constructors
    public Person(String name, int age){
        this.age = age;
        this.name = name;
        this.height = 0;
        this.weight = 0;
    }

    // A method is written inside of the class beneath the constructor.
    public void printPerson(){
        System.out.println(this.name + " is " + this.age + " years old.");
    }
    // This method is intended to be visible to the outside world (/public/), and it does not return a value (/void/).

    /*
    Having methods that print something is bad. A preferred way is to define a method for the object that returns
    a "string representation" of the object. The method returning the string representation is always toString in Java.
     */

    public String toString(){
        return this.name + " is " + this.age + " years old, their BMI is " + bodyMassIndex(); // can also be with this.
    }

    /*
    The /static/ modifier indicates that the method in question does not belong to an object and thus cannot be used
    to access any variables that belong to objects.

    Our methods will not include the static keyword if they're used to process information about objects created from
    a given class.

    If a method receives as parameters all the variables whose values it uses, it can have a static modifier.
     */

    public void growOlder(){
        //this.age += 1;
        this.growOlder(1);
    }

    public void growOlder(int years) { this.age += years; }

    /*
    The keyword /void/ means that the method does not return a value.

    If we want the method to return a value, we need to replace the void keyword with the type of the variable to be
    returned.
     */
    // Getters:
    public int getAge(){ return this.age; }
    public String getName(){ return this.name; }
    public int getHeight() { return this.height; }
    public int getWeight(){ return this.weight; }

    // Setters:
    public void setAge(int age){ this.age = age; }
    public void setHeight(int height) { this.height = height; }
    public void setWeight(int weight) { this.weight = weight; }

    public boolean isOfLegalAge(){
        if (this.age >= 18) { return true; }
        else { return false; }
    }
    public double bodyMassIndex(){
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
}

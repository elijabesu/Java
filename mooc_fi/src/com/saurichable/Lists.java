package com.saurichable;

import java.util.ArrayList; // importing ArrayList
import java.util.Scanner;

public class Lists {
    /*
    Creating a new list is done with the command ArrayList<Type> list = new ArrayList<>(), where Type is the type of
    the values to be stored in the list (e.g. String).

    When a list variable is initialized, the type of the values to be stored is also defined in addition to the
    variable type — all the variables stored in a given list are of the same type.

    When defining the type of values that a list can include, the first letter of the element type has to be
    capitalized. A list that includes int-type variables has to be defined in the form ArrayList<Integer>; and a list
    that includes double-type variables is defined in the form ArrayList<Double>.

    Value-type variables such as int or double hold their actual values. Reference-type variables such as ArrayList,
    in contrast, contain a reference to the location that contains the value(s) relating to that variable.

    Once a list has been created, ArrayList assumes that all the variables contained in it are reference types. Java
    automatically converts an int variable into Integer when one is added to a list, and the same occurs when
    a variable is retrieved from a list. The same conversion occurs for double-type variables, which are converted to
    Double.
     */
    public static void typesOfLists() {
        ArrayList<String> str_list = new ArrayList<>();
        str_list.add("String is a reference-type variable.");
        ArrayList<Integer> int_list = new ArrayList<>();
        int_list.add(1);
        ArrayList<Double> dou_list = new ArrayList<>();
        dou_list.add(4.2);
        ArrayList<Boolean> boo_list = new ArrayList<>();
        boo_list.add(true);
    }

    public static void gettingFromLists(int index) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Hello");
        wordList.add("Bye");

        System.out.println(wordList.get(index)); // .get(INDEX)
    }
    public static void printSecondPlusThird() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println("Enter numbers:");
        int value;
        while (true) {
            value = Integer.valueOf(scanner.nextLine());
            if (value == 0) { break; }
            intList.add(value);
        }
        int sizeOfList = intList.size();
        System.out.println("Sum of the second and third: " + (intList.get(1) + intList.get(2)));
        System.out.println("Number of values: " + sizeOfList);
    }
    public static ArrayList returnList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println("Enter numbers:");
        int value;
        while (true) {
            value = Integer.valueOf(scanner.nextLine());
            if (value == 0) { break; }
            intList.add(value);
        }
        return intList;
    }
    public static void loopingLists(){
        ArrayList<String> members = new ArrayList<>();
        members.add("Jun");
        members.add("Chan");
        members.add("WOW");
        members.add("BK");
        members.add("Daehyun");
        for (int i = 0; i < members.size(); i++){
            System.out.println(members.get(i));
        }
        //OR
        /*
        int j = 0;
        while(j < members.size()){
            System.out.println(members.get(j));
            j++;
        }
         */
        for (int j = members.size() - 1; j >= 0; j--){
            System.out.println(members.get(j));
        }
        System.out.println("Chan has the index: " + members.indexOf("Chan"));
    }
}

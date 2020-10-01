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
    public static void indexOfSmallest(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println("Enter numbers:");
        int value;
        int smallest = -1;
        while (true) {
            value = Integer.valueOf(scanner.nextLine());
            if (value == -1) { break; }
            intList.add(value);
            if (smallest == -1 || smallest > value) { smallest = value; }
        }
        System.out.println("Smallest number: " + smallest);
        findIndex(intList, smallest);
    }
    public static void findIndex(ArrayList<Integer> list, int value){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == value){
                System.out.println("Found at index: " + i); }
        }
    }

    /*
    If you don't need to keep track of the index as you're going through a list's values, you can make use of the
    for-each loop. It differs from the previous loops in that it has no separate condition for repeating or
    incrementing.

    In practice, the for-each loop examines the values of the list in order one at a time. The expression is defined
    in the following format:
        for (TypeOfVariable nameOfVariable: nameOfList)
    , where TypeOfVariable is the list's element type, and nameOfVariable is the variable that is used to store each
    value in the list as we go through it.
     */
    public static void forEachLoop(){
        ArrayList<String> members = new ArrayList<>();
        members.add("Jun");
        members.add("Chan");
        members.add("WOW");
        members.add("BK");
        members.add("Daehyun");

        for (String member: members){ System.out.println(member); }
    }
    public static void sumForEach(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println("Enter numbers:");
        int value = 0;
        int sum = 0;
        int avg = 0;
        while (true) {
            value = Integer.valueOf(scanner.nextLine());
            if (value == -1) { break; }
            intList.add(value);
        }
        for (int number: intList){
            sum += number;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + ((double) sum / intList.size()));
    }

    /*
    The list's remove method removes the value that is located at the index that's given as the parameter. The
    parameter is an integer.
        list.remove(1);

    If the parameter given to remove is the same type as the values in the list, but not an integer, (integers are
    used to remove from a given index), it can be used to remove a value directly from the list.
        list.remove("First");

    To remove an integer type value you can convert the parameter to Integer type; this is achieved by the valueOf
    method of the Integer class.
        list.remove(Integer.valueOf(15));

    The list method contains can be used to check the existence of a value in the list. The method receives the value
    to be searched as its parameter, and it returns a boolean type value (true or false) that indicates whether or not
    that value is stored in the list.
     */
    public static void onList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter names: ");
        String name;
        while (true){
            name = scanner.nextLine();
            if (name.equals("")){ break; }
            list.add(name);
        }
        System.out.print("Search for? ");
        String search = scanner.nextLine();
        if (list.contains(search)) {
            System.out.println(search + " was found.");
        } else {
            System.out.println(search + " was not found.");
        }
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        System.out.println("The numbers in range [" + lowerLimit + ", " + upperLimit + "]:");
        for (int number: numbers){
            if (number >= lowerLimit && number <= upperLimit){
                System.out.println(number);
            }
        }
    }
    public static void testPrintNumbersInRange(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        printNumbersInRange(numbers, 0, 5);
        printNumbersInRange(numbers, 3, 10);
    }

    public static void summary(){
        // making a new String list:
        ArrayList<String> list = new ArrayList<>();

        // adding things to a list:
        list.add("Hello :3");
        list.add("You alright?");
        list.add("Yeah, mate.");

        // getting the number of elements:
        int size = list.size();
        System.out.println(size);

        // getting a value from a certain index:
        String string = list.get(1);
        System.out.println(string);

        // removing things from a list:
        list.remove(1);
        list.remove("Hello :3");

        // checking if a value exists in a list:
        boolean found = list.contains("Hello :3");
    }
}

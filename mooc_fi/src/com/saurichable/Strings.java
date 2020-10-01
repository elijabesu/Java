package com.saurichable;

import java.util.ArrayList;
import java.util.Scanner;

public class Strings {
    public static void isItTrue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String string = scanner.nextLine();
        if (string.equals("true")) {
            System.out.println("You got it right.");
        } else {
            System.out.println("Try again.");
        }
    }
    public static void password(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String un = scanner.nextLine();
        System.out.print("Password: ");
        String pw = scanner.nextLine();
        if (un.equals("alex")){
            if (pw.equals("sunshine")){
                System.out.println("You have successfully logged in.");
            } else {
                System.out.println("Incorrect username or password.");
            }
        } else if (un.equals("emma")){
            if (pw.equals("haskell")){
                System.out.println("You have successfully logged in.");
            } else {
                System.out.println("Incorrect username or password.");
            }
        } else {
            System.out.println("Incorrect username or password.");
        }
    }
    public static void splittingString(){
        String text = "owo what is that 5";
        String[] pieces = text.split(" "); // always produces a list of strings

        for (int i = 0; i < pieces.length; i++){
            System.out.println(pieces[i]);
        }
        // if we want to work with ints, we need to convert it:
        System.out.println("Integer + 10: " + (10 + Integer.valueOf(pieces[pieces.length - 1])));
    }
    public static void containAV(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings:");
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) { break; }
            String[] splitString = string.split(" ");
            for (int i = 0; i < splitString.length; i++) {
                if (splitString[i].contains("av")) {
                    System.out.println(splitString[i]);
                }
            }
        }
    }

    /*
    You can get a character at a specified index of a string with the charAt method.
     */
    public static void firstCharacter(String string){
        char character = string.charAt(0);
        System.out.println(character);
    }

    public static void personalDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details:");
        String detail;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();
        while (true){
            detail = scanner.nextLine();
            if (detail.equals("")) { break; }
            String[] temp = detail.split(",");
            names.add(temp[0]);
            years.add(Integer.valueOf(temp[1]));
        }
        String longestName = "";
        for (String name: names){
            if (longestName.length() < name.length()) { longestName = name; }
        }
        System.out.println("Longest name: " + longestName);
        int sum = 0;
        for (int year: years){
            sum += year;
        }
        System.out.println("Average of the birth years: " + ((double) sum / years.size()));
    }
}

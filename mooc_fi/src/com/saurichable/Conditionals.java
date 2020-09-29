package com.saurichable;

import java.util.Scanner;

public class Conditionals {
    public static void ConditionalsMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number: ");
        int value = Integer.valueOf(scanner.nextLine());
        if (value == 1984) {
            System.out.println("Orwell");
        } else if (value == 2020) {
            System.out.println("This year");
        } else {
            System.out.println("I do not care");
        }

        System.out.println("Enter a grade: ");
        int grade = Integer.valueOf(scanner.nextLine());
        if (grade < 0) {
            System.out.println("Incorrect value.");
        } else if (grade <= 49) {
            System.out.println("F");
        } else if (grade <= 59) {
            System.out.println("E");
        } else if (grade <= 69) {
            System.out.println("D");
        } else if (grade <= 79) {
            System.out.println("C");
        } else if (grade <= 89) {
            System.out.println("B");
        } else if (grade <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Insane.");
        }

        /*
        Even though we can compare integers, floating point numbers, and boolean values using two equals signs
        (variable1 == variable2), we cannot compare the equality of strings using two equals signs. When comparing
        strings we use the equals-command, which is related to string variables.
         */
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        if (str.equals("a string")) {
            System.out.println("yay");
        } else {
            System.out.println("nay");
        }

        /*
        The expression of a conditional statement may consist of multiple parts, in which the logical operators
        and &&, or ||, and not ! are used.
         */
        System.out.println("Enter a year:");
        int year = Integer.valueOf(scanner.nextLine());
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("This year is a leap year.");
        } else if (year % 4 == 0) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }
    }
}

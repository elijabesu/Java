package com.saurichable;

import java.util.Scanner;

public class Part_2 {
    public static void whileSum5() {
        Scanner scanner = new Scanner(System.in);
        int numbersSummed = 0;
        int sum = 0;

        /*
        while (true) {
            if (numbersSummed == 5) {
                break;
            }
         */
        while (numbersSummed < 5) {
            System.out.println("Enter a number: ");
            sum += Integer.valueOf(scanner.nextLine());
            numbersSummed++;
        }

        System.out.println("The sum of the numbers is " + sum);
    }
    public static void forSum5() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            sum += Integer.valueOf(scanner.nextLine());
        }

        System.out.println("The sum of the numbers is " + sum);
    }
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);
    }
    public static void fiveParts() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int total = 0;
        double avg = 0.0;
        int even = 0;
        int odd = 0;
        System.out.println("Enter numbers: ");

        while (true) {
            number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += number;
            total++;
        }
        avg = (double) sum / total;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}

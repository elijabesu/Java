package parts.eight;

import java.util.Scanner;

public class Recap {
    public static void cubes() {
        System.out.println("== cubes ==");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int number = Integer.valueOf(input);
            System.out.println(number * number * number);
        }
    }
    public static void averageOfPositiveNumbers() {
        System.out.println("== average of positive numbers ==");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else if (input > 0) {
                sum += input;
                total++;
            }
        }
        if (total == 0) {
            System.out.println("Cannot calculate the average.");
        } else {
            System.out.println((double) sum / total);
        }
    }
    public static void liquidContainers() {
        System.out.println("== liquid containers ==");
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            if (amount <= 0) {
                continue;
            }
            if (parts[0].equals("add")) {
                if (first + amount <= 100) {
                    first += amount;
                } else {
                    first = 100;
                }
            } else if (parts[0].equals("move")) {
                if (first - amount >= 0) {
                    first -= amount;
                } else {
                    amount = first;
                    first = 0;
                }
                if (second + amount <= 100) {
                    second += amount;
                } else {
                    second = 100;
                }
            } else if (parts[0].equals("remove")) {
                if (second - amount >= 0) {
                    second -= amount;
                } else {
                    second = 0;
                }
            }
        }
    }
}

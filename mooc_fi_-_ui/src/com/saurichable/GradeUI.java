package com.saurichable;

import java.util.Scanner;

public class GradeUI {
    private Scanner scanner;
    private GradeRegister register;

    public GradeUI(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println();
        printGradeDistribution();
        printAverageOfPoints();
        printAverageOfGrades();
    }
    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) { break; }

            int points = Integer.valueOf(input);
            if (points < 0 || points > 100) {
                System.out.println("Invalid number.");
                continue;
            }
            this.register.addGradeBasedOnPoints(points);
        }
    }
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();
            grade--;
        }
    }
    public static void printStars(int stars) { // doesn't work with any this.
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    public void printAverageOfGrades() {
        System.out.println("The average of grades: " + this.register.averageOfGrades());
    }
    public void printAverageOfPoints() {
        System.out.println("The average of points: " + this.register.averageOfPoints());
    }
}

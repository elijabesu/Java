package com.saurichable;

import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> points;

    public GradeStatistics() {
        this.points = new ArrayList<>();
    }
    public void add(int number) {
        if (number >= 0 && number <= 100) {
            this.points.add(number);
        }
    }
    public double averageOfPoints() {
        return averageOfPoints(0);
    }
    public double averageOfPoints(int minimum) {
        int sum = 0;
        int total = 0;
        for (int point: this.points) {
            if (point >= minimum) {
                sum += point;
                total++;
            }
        }
        if (total == 0) { return -1; }
        return (double) sum / total;
    }
    public double passingPercentage(int minimum) {
        int passed = 0;
        for (int point: this.points) {
            if (point >= minimum) {
                passed++;
            }
        }
        return (double) passed / this.points.size() * 100;
    }
    public void gradeDistribution() {
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(amountOfGrades(i));
            System.out.println();
        }
    }
    public void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
    }
    public int amountOfGrades(int grade) {
        int amount = 0;
        for (int point: this.points) {
            if (this.pointsToGrade(point) == grade) {
                amount++;
            }
        }
        return amount;
    }
    public int pointsToGrade(int points) {
        if (points < 50) { return 0; }
        if (points < 60) { return 1; }
        if (points < 70) { return 2; }
        if (points < 80) { return 3; }
        if (points < 90) { return 4; }
        return 5;
    }
}

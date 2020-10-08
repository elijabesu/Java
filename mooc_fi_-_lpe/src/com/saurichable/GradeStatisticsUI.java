package com.saurichable;

import java.util.Scanner;

public class GradeStatisticsUI {
    private GradeStatistics gradeStatistics;

    public GradeStatisticsUI() {
        this.gradeStatistics = new GradeStatistics();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            this.gradeStatistics.add(number);
        }
        this.average();
        this.passingAverage();
        this.passPercentage();
        this.gradeDistribution();
    }
    public void average() {
        System.out.println("Point average (all): " + this.gradeStatistics.averageOfPoints());
    }
    public void passingAverage() {
        double passingAverage = this.gradeStatistics.averageOfPoints(50);
        if (passingAverage == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAverage);
        }
    }
    public void passPercentage() {
        System.out.println("Pass percentage: " + this.gradeStatistics.passingPercentage(50));
    }
    public void gradeDistribution() {
        System.out.println("Grade distribution:");
        this.gradeStatistics.gradeDistribution();
    }
}

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
        System.out.println(this.average());
        System.out.println(this.passingAverage());
        System.out.println(this.passPercentage());
        System.out.println(this.gradeDistribution());
    }
    public String average() {
        return "Point average (all): " + this.gradeStatistics.averageOfPoints();
    }
    public String passingAverage() {
        double passingAverage = this.gradeStatistics.averageOfPoints(50);
        if (passingAverage == -1) {
            return "Point average (passing): -";
        } else {
            return "Point average (passing): " + passingAverage;
        }
    }
    public String passPercentage() {
        return "Pass percentage: " + this.gradeStatistics.passingPercentage(50);
    }
    public String gradeDistribution() {
        return "Grade distribution:\n" + this.gradeStatistics.gradeDistribution();
    }
}

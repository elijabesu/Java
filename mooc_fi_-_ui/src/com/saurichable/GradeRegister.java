package com.saurichable;

import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }
    public int pointsToGrade(int points) {
        if (points < 50) { return 0; }
        else if (points < 60) { return 1; }
        else if (points < 70) { return 2; }
        else if (points < 80) { return 3; }
        else if (points < 90) { return 4; }
        else { return 5; }
    }
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int integer: this.grades) {
            if (integer == grade) { count++; }
        }
        return count;
    }
    public double averageOfGrades() {
        if (this.grades.size() == 0) { return -1; }
        int sum = 0;
        for (int grade: this.grades) {
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }
    public double averageOfPoints() {
        if (this.points.size() == 0) { return -1; }
        int sum = 0;
        for (int points: this.points) {
            sum += points;
        }
        return (double) sum / this.points.size();
    }
}

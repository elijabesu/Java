package com.saurichable;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
    /*
    Reading a file is done using the Scanner-class. When we want to read a file using the Scanner-class, we give the
    path for the file we want to read as a parameter to the constructor of the class. The path to the file can be
    acquired using Java's Paths.get command, which is given the file's name in string format as a parameter:
        Paths.get("filename.extension").
    When the Scanner-object that reads the file has been created, the file can be read using a while-loop. The reading
    proceeds until all the lines of the file have been read, i.e., until the scanner finds no more lines to read.
    Reading a file may result in an error, and it's for this reason that the process requires separate blocks - one
    for the try, and another to catch potential errors.
     */

    public static void fileReading(){
        try (Scanner scanner = new Scanner(Paths.get("discord_backup_codes.txt"))){
            while(scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()) { continue; }
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void teamsFileReading(){
        Scanner userInput = new Scanner(System.in);
        try (Scanner scanner = new Scanner(Paths.get("data.csv"))){
            ArrayList<String> homeTeam = new ArrayList<>();
            ArrayList<String> visitTeam = new ArrayList<>();
            ArrayList<Integer> homeTeamPoints = new ArrayList<>();
            ArrayList<Integer> visitTeamPoints = new ArrayList<>();

            while (scanner.hasNextLine()){
                String[] splitLine = scanner.nextLine().split(",");
                homeTeam.add(splitLine[0]);
                visitTeam.add(splitLine[1]);
                homeTeamPoints.add(Integer.valueOf(splitLine[2]));
                visitTeamPoints.add(Integer.valueOf(splitLine[3]));
            }
            System.out.print("Enter the team's name: ");
            String team = userInput.nextLine();
            int games = 0;
            int wins = 0;
            int losses = 0;
            for (int i = 0; i < homeTeam.size(); i++) {
                if (homeTeam.get(i).equals(team)) {
                    games += 1;
                    if (homeTeamPoints.get(i) > visitTeamPoints.get(i)) {
                        wins += 1;
                    } else { losses += 1; }
                }
            }
            for (int i = 0; i < visitTeam.size(); i++) {
                if (visitTeam.get(i).equals(team)) {
                    games += 1;
                    if (homeTeamPoints.get(i) > visitTeamPoints.get(i)) {
                        losses += 1;
                    } else { wins += 1; }
                }
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

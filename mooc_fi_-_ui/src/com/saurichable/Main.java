package com.saurichable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        WordSet
        -- files:
            -- UserInterface.java
            -- WordSet.java

        Scanner scanner = new Scanner(System.in);
        WordSet wordSet = new WordSet();

        UserInterface ui = new UserInterface(wordSet, scanner);
        ui.start();

         */

        /*
        TodoList
        -- files:
            -- TodoList.java
            -- TodoUserInterface.java

        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();

        TodoUserInterface tdUi = new TodoUserInterface(list, scanner);
        tdUi.start();

         */

        /*
        GradeRegister
        -- files:
            -- GradeRegister.java
            -- GradeUI.java
         */
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        GradeUI gradeUI = new GradeUI(register, scanner);
        gradeUI.start();

    }
}

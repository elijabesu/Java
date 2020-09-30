package com.saurichable;

public class Methods {
    /*
    The names of methods begin with a word written entirely with lower-case letters, and the rest of the words
    begin with an upper-case letter - this style of writing is known as camelCase. Additionally, the code inside
    methods is indented by four characters.

    Parameters are values given to a method that can be used in its execution. The parameters of a method are
    defined on the uppermost line of the method within the parentheses following its name. The values of the
    parameters that the method can use are copied from the values given to the method when it is executed.
     */

    public static void methodsMethod(int one, int two){
        System.out.println("The sum of the numbers is: " + (one + two));
    }

    /*
    The definition of a method tells whether that method returns a value or not. If it does, the method definition has
    to include the type of the returned value. Otherwise the keyword void is used in the definition.

    To actually return a value, we use the command return followed by the value to be returned (or the name of the
    variable whose value is to be returned).
     */

    public static int alwaysReturnTen() { return 10; }

    public static String returnString(String str) { return "Hello " + str + "!"; }

    /*
    If a method has the form public static void nameOfMethod() it is possible to return from it — in other words, to
    stop its execution in that place — with the return command that is not followed by a value. For instance:
     */

    public static void division(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Can not divide by 0!");
            return;
        }

        System.out.println("" + numerator + " / " + denominator + " = " + (1.0 * numerator / denominator));
    }

    public static int sumOfTwo(int x, int y) { return x + y; }

    public static int smaller(int x, int y) {
        if (x < y) { return x; }
        else { return y; }
    }

    public static int bigger(int x, int y) {
        if (x > y) { return x; }
        else { return y; }
    }

    public static void printStars(int number) {
        int i = 1;
        while (i <= number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
    public static void printSquare(int size) {
        int i = 1;
        while (i <= size) {
            printStars(size);
            i++;
        }
    }
    public static void printRectangle(int width, int height) {
        int i = 1;
        while (i <= height) {
            printStars(width);
            i++;
        }
    }
    public static void printLeftTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;
        }
    }
    public static void printSpaces(int number) {
        int i = 1;
        while (i <= number) {
            System.out.print(" ");
            i++;
        }
    }
    public static void printRightTriangle(int size) {
        int i = 1;
        int j;
        while (i <= size) {
            j = size - i;
            printSpaces(j);
            printStars(i);
            i++;
        }
    }
    public static void printChristmasTree(int height) {
        int i = 1;
        int j;
        while (i <= height) {
            j = height - i;
            printSpaces(j);
            if (i == 1) { printStars(i); }
            else { printStars(i+i-1); }
            i++;
        }
        printBottomOfTree(height - 2, 3, 2);
    }
    public static void printBottomOfTree(int spaces, int stars, int times) {
        for (int i = 0; i < times; i++) {
            printSpaces(spaces);
            printStars(stars);
        }
    }
}

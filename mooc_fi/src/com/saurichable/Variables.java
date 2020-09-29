package com.saurichable;

import java.util.Scanner;

public class Variables {
    public static void variablesMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        String message = scanner.nextLine();
        System.out.println("Write a number: ");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("Write a double: ");
        double doubleValue = Double.valueOf(scanner.nextLine());
        System.out.println("Write a boolean: ");
        boolean boolValue = Boolean.valueOf(scanner.nextLine());
        /*
        When converting a string to a boolean, the string must be "true" if we want the boolean value to be true.
        The case is insensitive here. All other strings turn into the boolean false.
         */
        System.out.println("String: " + message + "\nInt: " + value + "\nDouble: " + doubleValue + "\nYou wrote: " +
                boolValue + "\n");

        /*
        Once a variable's type has been declared, it can no longer be changed. For example, a boolean value cannot be
        assigned to a variable of the integer type, nor can an integer be assigned to a variable of the boolean tpe.

            boolean integerAssignmentWillWork = false;
            integerAssignmentWillWork = 42; // Does not work

            int value = 10;
            integerAssignmentWillWork = value; // Neither does this

        However, exceptions do exist: an integer can be assigned to a variable of the double type, since Java knows
        how to convert an integer to a double during assignment.
        A floating-point value cannot, however, be assigned to an integer variable.
         */

        /*
        Variable naming is limited by certain constraints -- the convention is to use a style known as camelCase
        Numbers can be used within a variable name as long as the name does not begin with a number.
         */

        /*
        int         An integer can contain whole numbers whose values lie between -2147483648 and 2147483647.
        double      Floating-point numbers contain decimal numbers, with the greatest possible value being
                    approximately 21023. When a decimal number is represented with a floating-point number, the value
                    can be inaccurate as floating-points are incapable of representing all decimal numbers. The reasons
                    behind this are explored in the Computer organization course.
        String      A string can contain text. Strings are enclosed in quotation marks.
        boolean     A boolean contains either the value true or false.
         */
    }
}

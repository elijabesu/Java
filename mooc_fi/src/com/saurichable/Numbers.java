package com.saurichable;

public class Numbers {
    public static void NumbersMethod(){
        System.out.println("Four: " + (2 + 2));
        System.out.println("But! Twenty-two: " + 2 + 2);
        /*
        If one of the operands of the operation + is a string, the other operand will be changed into a string
        too during program execution.
         */

        /*
        Division of integers is a slightly trickier operation. The types of the variables that are part of the division
        determine the type of result achieved by executing the command. If all of the variables in the division
        expression are integers, the resulting value is an integer as well.
         */
        int result = 3 / 2;
        System.out.println(result); // prints 1
        /*
        If the dividend or divisor (or both) of the division is a floating point number, the result is a floating point
        number as well.
         */
        double whenDividendIsFloat = 3.0 / 2;
        System.out.println(whenDividendIsFloat); // prints 1.5
        /*
        An integer can be converted into a floating point number by placing a type-casting operation (double) before it:
         */
        int first = 3;
        int second = 2;

        double result1 = (double) first / second;
        System.out.println(result1); // prints 1.5
        double result2 = (double) (first / second);
        System.out.println(result2); // prints 1.0
        double result3 = first / second * 1.0;
        System.out.println(result3); // prints 1.0 bc first / second is done first and results in 1
    }
}

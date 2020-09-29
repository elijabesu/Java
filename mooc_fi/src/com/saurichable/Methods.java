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

    public static int alwaysReturnsTen() {
        return 10;
    }

    public static String returnsAString(String str) {
        return "Hello " + str + "!";
    }

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
}

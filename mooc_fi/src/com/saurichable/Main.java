package com.saurichable;

public class Main {
    public static void main(String[] args) {
        /*
        // Part 1
        Variables variablesObject = new Variables();
        variablesObject.variablesMethod();

        Numbers numbersObject = new Numbers();
        numbersObject.numbersMethod();

        Conditionals conditionalsObject = new Conditionals();
        conditionalsObject.conditionalsMethod();

        // Part 2
        Part_2 part_2Object = new Part_2();
        part_2Object.whileSum5();
        part_2Object.forSum5();
        part_2Object.factorial();
        part_2Object.fiveParts();

         */

        Methods methodsObject = new Methods();
        methodsObject.methodsMethod(5,6);
        int number = methodsObject.alwaysReturnsTen();
        System.out.println("The method returned: " + number);
        String str = methodsObject.returnsAString("Ellie");
        System.out.println("The method returned: " + str);
    }
}

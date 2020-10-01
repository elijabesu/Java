package com.saurichable;

import java.util.ArrayList;

public class Arrays {
    /*
    From the point of view of the programmer, the size of the ArrayList is unlimited. When you create a list, a limited
    space is reserved in the memory of the computer. When the ArrayList runs out of space, a larger space is reserved
    and the data from the previous space is copied to the new one.

    An Array contains a limited amount of numbered spots (indices) for values. The length (or size) of an Array is the
    amount of these spots, i.e. how many values can you place in the Array. The values in an Array are called elements.

    There are two ways to create an Array. In the first one you have to explicitly define the size upon the creating.
        int[] numbers = new int[3];
    An array is declared by adding square brackets after the type of the elements it contains (typeOfElements[]).
    A new Array is created by calling new followed by the type of the elements, square brackets and the number of the
    elements in the square brackets.
        String[] strings = new String[5];

    We can also initialize an array with a block, that contains comma-separated values to be assigned in the array.
    This works for all the types. When you initialize an array with a block, the length of the array is precisely the
    number of the values specified in the block.
     */
    public static void creatingArrays(){
        // create an int array that can hold 3 elements:
        int[] numbers = new int[3];
        // assigning elements:
        numbers[0] = 2;
        numbers[2] = 5;
        System.out.println(numbers[2]);
        // NEBO
        int[] numerals = {1, 2, 3, 4};
        System.out.println(numerals[2]);
    }
    public static void iteratingArrays(){
        int[] numbers = new int[4];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        System.out.println("The array has " + numbers.length + " elements.");

        int i = 0;
        while (i < numbers.length){
            System.out.println(numbers[i]);
            i++;
        }
    }
    public static void findIndex(int[] list, int value){
        boolean found = false;
        for (int i = 0; i < list.length; i++){
            if (list[i] == value){
                found = true;
                System.out.println(value + " found at index " + i); }
        }
        if (found == false) {
            System.out.println(value + " not found");
        }
    }
    public static void testingFindIndex(){
        int[] numbers = new int[4];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        findIndex(numbers, 5);
        findIndex(numbers, 13);
    }
    public static int sumOfNumbersInArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static void printNeatly(int[] array){
        String string = "";
        for (int i = 0; i < array.length; i++){
            string += array[i];
            if (i != array.length - 1) { string += ", ";}
        }
        System.out.println(string);
    }
    public static void printArrayInStars(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i]; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
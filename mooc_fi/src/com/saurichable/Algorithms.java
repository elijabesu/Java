package com.saurichable;

import java.util.ArrayList;

public class Algorithms {

    // SELECTION SORT
    public static int smallest(int[] numbers) {
        int smol = numbers[0];
        for (int number: numbers) {
            if (smol > number) { smol = number; }
        }
        return smol;
    }
    public static int indexOfSmallest(int[] numbers) {
        int index = 0;
        int smol = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (smol > numbers[i]) {
                smol = numbers[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] numbers, int startIndex) {
        int index = startIndex;
        int smol = numbers[startIndex];
        for (int i = startIndex; i < numbers.length; i++) {
            if (smol > numbers[i]) {
                smol = numbers[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    /*
    public static void sort(int[] array) {
        int indexOfSmallestNumber = 0;
        for (int i = 0; i < array.length; i++) {
            indexOfSmallestNumber = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallestNumber);
            System.out.println(java.util.Arrays.toString(array));
        }
    }
     */

    /*
    Java offers a significant amount of ready to use sorting algorithms. Arrays can be sorted (into their natural
    order) using the class method sort of the Arrays-class. Lists can be sorted (into their natural order) using
    the class method sort of the Collections class.
     */

    public static void sort(int[] array) {
        java.util.Arrays.sort(array);
    }
    public static void sort(String[] array) {
        java.util.Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers) {
        java.util.Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings) {
        java.util.Collections.sort(strings);
    }

    /*
    LINEAR SEARCH is a search algorithm that searches for information in an array by going through every value in
    the array one by one. When the value that was searched for is found, its index is immediately returned. If the
    requested value cannot be found, linear sort returns the information that the value was not found — typically
    this means returning -1 instead of a valid index.
     */
    public static int linearSearch(int[] array, int searched) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searched) {
                return i;
            }
        }
        return -1;
    }

    /*
    BINARY SEARCH
    When the data searched is in order, searching can be implemented a lot more efficiently than in linear search.
    The idea behind Binary Search is to start looking for the searched value in the middle index of the array (or
    list), compare the value found there to the searched value, and if needed (i.e, when the value isn't found there)
    eliminate half of the search area.

    - Data is searched in an ordered array or list.
    - Search begins in the middle.
    - The the value of the examined middle point is not the value that is searched for, we exclude half of the previous
    search are and move to examine the middle point of the remaining area.
    - If the examined middle value is the value that is searched for, we return the index of that middle point.
    - If the search area does not exist anymore (every index has been excluded from the list of possinilities),
    the value of -1 is returned. It indicates that the value in question cannot be found.
     */

    public static int linearSearch(ArrayList<Books> books, int searchedYear) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear() == searchedYear) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(ArrayList<Books> books, int searchedYear) {
        int begin = 0;
        int end = books.size() - 1;
        while (begin <= end) {
            int middle = (end + begin) / 2;
            if (books.get(middle).getYear() < searchedYear) {
                begin = middle + 1;
            } else if (books.get(middle).getYear() > searchedYear) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
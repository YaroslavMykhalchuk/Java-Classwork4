package org.example;

import GenericMethods.GenericMethods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 4, 5, 7, 3};
        System.out.println("Max of {1,4,7} = " + GenericMethods.max(1, 4, 7));
        System.out.println("Max of {1,4,7,8,3} = " + GenericMethods.max(1, 4, 7, 8, 3));
        System.out.println("Average of array = " + GenericMethods.average(array, x -> x));
        System.out.println("Max of array = " + GenericMethods.max(array));
        System.out.println("Min of array = " + GenericMethods.min(array));
        GenericMethods.sort(array);
        System.out.println("Sort of array = " + Arrays.toString(array));

        System.out.println("Binary search of array = " + Arrays.binarySearch(array, 5));

    }
}
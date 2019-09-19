package com.pradeep.algorithms.sorting;

public class SortUtils {
    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array){
        for(int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}

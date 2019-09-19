package com.pradeep.algorithms.searching;

import com.pradeep.algorithms.sorting.SortUtils;

/**

 */
public class BinarySearch {

    static int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int position = search.binarySearch(3);
        if(position == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element present at "+position);
    }

    /**
     */
    private static int binarySearch(int element){
        int min = 0;
        int max = array.length - 1;

        while(min <= max){
            int mid = min + (max - min)/2;
            if(array[mid] == element)
                return mid;

            if(array[mid] > element)
                max = mid - 1;
            else
                min = mid + 1;
        }
        return -1;
    }
}

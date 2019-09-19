package com.pradeep.algorithms.sorting;

/**
 * In place sorting. O(N) space complexity.
 * O(N2) - time complexity.
 * Not a stable sort. Equal items might be rearranged.
 * O(N) swaps
 */
public class SelectionSort {

    static int[] array = {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        sort.sort();
    }

    /**
     * 0 to 8 - 1 to 9 - i>j
     * 1 to 8 - 2 to 9 - i>j
     */
    public void sort(){
        for(int i=0; i<array.length - 1; i++){
            for(int j=i+1; j<array.length; j++){
                //System.out.println(i+","+j);
                if(array[i] > array[j])
                    SortUtils.swap(i, j, array);
            }
            SortUtils.printArray(array);
        }
    }
}

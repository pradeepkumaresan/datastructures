package com.pradeep.algorithms;

/**
 * Best case - nearly sorted list.
 * worst case - list is sorted in reverse order.
 * In place sorting. O(N) space complexity.
 * O(N2) - time complexity.
 * O(N2) swaps
 * adaptive sort. If swap does not happen in an inner iteration, sort is ended as -
 * list is already sorted.
 * stable sort - order 2 equal elements will be maintained.
 */
public class BubbleSort {

    static int[] array = {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        sort.sort();
    }

    /**
     * 9 to 0 - 0 to 8 - j>j+1
     * 8 to 0 - 0 to 7 - j>j+1
     * ...
     */
    public void sort(){
        for(int i=array.length-1; i>0; i--){
            boolean swapped=false;
            for(int j=0; j<i; j++) {
                System.out.println(j + "," + (j + 1));
                if (array[j] > array[j + 1]) {
                    swapped=true;
                    SortUtils.swap(i, j, array);
                }
            }
            if(!swapped)
                break;
            SortUtils.printArray(array);
        }
    }
}

package com.pradeep.algorithms;

/**
 * Best case - nearly sorted list.
 * worst case - list is sorted in reverse order.
 * O(N2)
 * sorts in place - O(N)
 * O(N2) swaps
 * adaptive sort. If the current element is greater than sorted list,
 * inner loop is broken to get on to next iteration of outer loop.
 */
public class InsertionSort {

    static int[] array = {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        sort.sort();
    }

    /**
     * 1 to 9 - 1 to 1 - j-1 > j
     * 2 to 9 - 2 to 1 - j-1 > j
     */
    public void sort(){
        int counter = 0;
        for(int i=1; i<array.length; i++){
            for(int j=i; j>0; j--){
                counter++;
                if(array[j-1] > array[j]){
                    SortUtils.swap(j-1, j, array);
                }
                else
                    break;
            }
            SortUtils.printArray(array);
        }
        System.out.println(counter);
    }
}

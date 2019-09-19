package com.pradeep.algorithms.sorting;

/**

 */
public class ShellSort {

    static int[] array = {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};

    public static void main(String[] args) {
        ShellSort sort = new ShellSort();
        sort.sort();
        SortUtils.printArray(array);
    }

    /**
     */
    private static void sort(){
        for (int i = array.length / 2; i>0; i /= 2)
        {
            for (int j = i; j<array.length; j++)
            {
                for(int k = j - i; k>= 0; k = k - i)
                {
                    if (array[k+i] >= array[k])
                        break;
                    else
                    {
                        SortUtils.swap(k, k+i, array);
                    }
                }
            }
        }
    }
}

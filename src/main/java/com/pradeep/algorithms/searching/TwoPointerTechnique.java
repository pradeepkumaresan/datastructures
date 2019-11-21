package com.pradeep.algorithms.searching;

/**
 * To find if sum of any two numbers in a sorted array matches a number.
 * https://www.youtube.com/watch?v=OnaYh_naEAE
 */
public class TwoPointerTechnique {
    public static void main(String[] args) {
        int arr[] = {10, 23, 45, 67, 99, 103};
        int sum = 144;
        int i=0, j=arr.length-1;
        for (i=0; i<j; ){
            if(arr[i] + arr[j] == sum){
                System.out.println(arr[i] + " " +  arr[j]);
                System.exit(0);
            }
            else if (arr[i] + arr[j] < sum){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("No pair found.");
    }
}

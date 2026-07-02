package org.com.javaprograms.arrays;

import java.util.Arrays;

public class ShiftNonZerosToLeft {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] arr1 = {0, 1, 0, 3, 12};

        //Approach 1 : Traversing two times
        shiftNonZerosToLeft(arr);

        System.out.println(" ");
        //Approach 2 : In one traversal
        shiftNonZerosToLeft1(arr1);
    }

    private static void shiftNonZerosToLeft1(int[] arr1) {
        int left = 0;
        for(int right = 0; right<arr1.length; right++) {
            if(arr1[right] != 0){
                int temp = arr1[left];
                arr1[left] = arr1[right];
                arr1[right] = temp;

                left++;
            }
        }
        printArray(arr1);
    }

    private static void shiftNonZerosToLeft(int[] arr) {

        int writeIndex = 0;
        // Place all non-zero elements first
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[writeIndex] = arr[i];
                writeIndex++;
            }
        }

        // Fill remaining positions with zero
        while(writeIndex < arr.length){
            arr[writeIndex] = 0;
            writeIndex++;
        }

        printArray(arr);
    }

    //print the array
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

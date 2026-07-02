package org.com.javaprograms.arrays;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);
        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicates(int[] arr) {
       int uniqueIndex = 0;
       for (int readIndex = 1; readIndex < arr.length; readIndex++) {
           if(arr[uniqueIndex] != arr[readIndex]) {
               uniqueIndex++;
               arr[uniqueIndex] = arr[readIndex];
           }
       }
        return uniqueIndex+1;
    }
}

package org.com.javaprograms.arrays;

public class FindLargestAndSecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 10, 7, 9};
        findLargestAndSecondLargestNumber(arr);
    }

    private static void findLargestAndSecondLargestNumber(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists.");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }

    }
}

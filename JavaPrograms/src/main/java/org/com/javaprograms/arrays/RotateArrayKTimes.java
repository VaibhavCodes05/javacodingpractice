package org.com.javaprograms.arrays;

public class RotateArrayKTimes {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArrayBruteForce(arr, k);   // Time Complexity = O(k * n)
        System.out.print("Array after rotating brute force " + k + " times: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;

        rotateArrayOptimised(arr1, k1); // Time Complexity = O(n)
        System.out.print("\nArray after rotating optimised " + k1 + " times: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }

    /**
     * "Transformation Pattern"
     * Before rotation = [1,2,3,4 | 5,6,7]
     * A = [1,2,3,4] & B = [5,6,7]
     * After rotation = [5,6,7 | 1,2,3,4]
     * which means A B became B A
     * How ??
     *   Step 1: Reverse Entire Array  -> [7,6,5,4,3,2,1]
     *   Step 2: Reverse First k Elements -> [5,6,7,4,3,2,1]
     *   Step 3: Reverse Remaining Elements -> [5,6,7,1,2,3,4]
     */
    private static void rotateArrayOptimised(int[] arr1, int k1) {

        int n = arr1.length;
        int k = k1 % n;

        reverse(arr1,0,n-1);
        reverse(arr1,0 , k-1);
        reverse(arr1, k , n-1);
    }

    private static void reverse(int[] arr, int left,int right) {

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    private static void rotateArrayBruteForce(int[] arr, int k) {
        int n = arr.length;
        for(int rotation = 1;rotation<=k;rotation++){
            int lastElement = arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=lastElement;
        }
    }
}


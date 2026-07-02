package org.com.javaprograms.arrays;

//	Why Kadane Works
//	This is the key insight:
//	Suppose:
//	currentSum = -4
//	Next number : 5
//
//	Two options:
//	Continue old subarray:
//	-4 + 5 = 1
//
//	Start fresh:
//	5
//	Which is better?
//	5
//	Always.
//	Therefore:
//
//	Negative running sum = useless baggage
//	Throw it away.
//
//	Interview Memory Trick
//	----------------------
//	Imagine carrying a backpack.
//	Positive sum = Useful items(Keep carrying)
//	Negative sum = Heavy stones(Throw them away).
//	That's literally Kadane's Algorithm.


public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = findMaxSubArraySumBruteForce(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);

        int maxSumOptimizedKadane = findMaxSubArraySumKadane(arr);
        System.out.println("Maximum subarray sum is: " + maxSumOptimizedKadane);
    }

    private static int findMaxSubArraySumKadane(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum  = Math.max(arr[i], currentSum +arr[i]);

            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    private static int findMaxSubArraySumBruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        System.out.println("Maximum subarray sum initially: " + maxSum);
        for(int start = 0; start < arr.length; start++){
            int currentSum = 0;
            for(int end = start; end < arr.length; end++){
                currentSum += arr[end];

                maxSum = Math.max(currentSum, maxSum);
            }
        }

        return maxSum;
    }
}

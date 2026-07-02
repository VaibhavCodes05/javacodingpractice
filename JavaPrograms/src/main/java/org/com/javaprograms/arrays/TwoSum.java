package org.com.javaprograms.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int [] arr = {2, 7, 11, 15};
        int target = 9;
        int [] result = getTwoSumIndicesBruteForce(arr, target);
        System.out.println("Indices by Brute Force : " +Arrays.toString(result));

        int[] resultoptimized = getTwoSumIndicesOptimized(arr, target);
        System.out.println("Indices by Optimized : " +Arrays.toString(result));
    }

    private static int[] getTwoSumIndicesOptimized(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{};
    }

    private static int[] getTwoSumIndicesBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

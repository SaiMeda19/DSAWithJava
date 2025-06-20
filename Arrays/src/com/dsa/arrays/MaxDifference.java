package com.dsa.arrays;

public class MaxDifference {
    public static int maxDiff(int[] arr) {
        if (arr.length < 2) return 0;

        int minElement = arr[0];
        int maxDiff = arr[1] - arr[0];

        for (int j = 1; j < arr.length; j++) {
            int currentDiff = arr[j] - minElement;
            maxDiff = Math.max(maxDiff, currentDiff);
            minElement = Math.min(minElement, arr[j]);
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println("Max Difference: " + maxDiff(arr));
    }
}
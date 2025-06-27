package com.dsa.arrays;

public class MaxSumSubarrayOfSizeK {

    public static int maxSum(int[] arr, int k) {
        if (arr.length < k) return -1;

        int windowSum = 0;
        for (int i = 0; i < k; i++)
            windowSum += arr[i];

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];  // slide the window
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = maxSum(arr, k);
        System.out.println("Max sum of subarray of size " + k + " is: " + result);
    }
}
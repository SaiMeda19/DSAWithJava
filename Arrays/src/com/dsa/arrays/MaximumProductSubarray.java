package com.dsa.arrays;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            int tempMax = Math.max(current, Math.max(maxProd * current, minProd * current));
            minProd = Math.min(current, Math.min(maxProd * current, minProd * current));
            maxProd = tempMax;

            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int result = maxProduct(nums);
        System.out.println("Maximum product subarray is: " + result);
    }
}

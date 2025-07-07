package com.dsa.arrays;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);  // base case

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            if (prefixMap.containsKey(currentSum - k)) {
                count += prefixMap.get(currentSum - k);
            }

            prefixMap.put(currentSum, prefixMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays summing to " + k + ": " + result);
    }
}

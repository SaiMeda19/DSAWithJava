package com.dsa.arrays;

public class FindMinimumInRotatedArray {

    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Minimum lies to the right
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            }
            // Minimum is at mid or to the left
            else {
                high = mid;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int min = findMin(nums);
        System.out.println("Minimum element is: " + min);
    }
}

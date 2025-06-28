package com.dsa.arrays;


public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, 0, 5, 9, 12};
        int target = 9;

        int index = binarySearch(arr, target);
        if (index != -1)
            System.out.println("Target found at index: " + index);
        else
            System.out.println("Target not found.");
    }
}

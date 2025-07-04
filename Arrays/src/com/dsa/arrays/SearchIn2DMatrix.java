package com.dsa.arrays;

public class SearchIn2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0, high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int midElement = matrix[mid / cols][mid % cols];

            if (midElement == target) return true;
            else if (midElement < target) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + found);
    }
}

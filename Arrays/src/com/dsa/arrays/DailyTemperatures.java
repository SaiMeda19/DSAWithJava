package com.dsa.arrays;

import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // holds indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temps);

        System.out.print("Days to wait for warmer temp: ");
        for (int r : result) System.out.print(r + " ");
    }
}
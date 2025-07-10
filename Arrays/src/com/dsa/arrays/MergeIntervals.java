package com.dsa.arrays;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);

        for (int[] interval : intervals) {
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd) {
                current[1] = Math.max(currentEnd, nextEnd); 
            } else {
                current = interval;
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        System.out.print("Merged Intervals: ");
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
        }
    }
}

package com.dsa.arrays;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);

            while (set.contains(current)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(current);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}

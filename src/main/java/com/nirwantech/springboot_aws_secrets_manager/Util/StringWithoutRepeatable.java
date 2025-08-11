package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.HashMap;
import java.util.Map;

public class StringWithoutRepeatable {

    public static String longestUniqueSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int left = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                left = map.get(currentChar) + 1;
            }

            map.put(currentChar, right);

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String str = "kishkishan";
        System.out.println("Longest unique substring: " + longestUniqueSubstring(str));
    }
}

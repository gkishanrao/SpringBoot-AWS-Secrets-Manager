package com.nirwantech.springboot_aws_secrets_manager.Util;
public class ReverseAlphaOnly {

    public static String reverseAlphabetOnly(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Skip non-letter characters from the left
            if (!Character.isLetterOrDigit(chars[left])) {
                left++;
            }
            // Skip non-letter characters from the right
            else if (!Character.isLetterOrDigit(chars[right])) {
                right--;
            }
            // Swap alphabetic characters
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "Ki@shan^%$";
        String output = reverseAlphabetOnly(input);
        System.out.println(output);  // Output: EDC@#$BA^%$
    }
}

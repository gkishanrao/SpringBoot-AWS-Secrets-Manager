package com.nirwantech.springboot_aws_secrets_manager.Util.TestJava8;

public class RomanNumber {

    public static String intToRoman(int num) {
        // Define values and their corresponding Roman symbols
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40, 10,  9, 5,  4, 1};
        String[] symbols ={"M",  "CM","D", "CD","C", "XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        // Loop through each symbol
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(intToRoman(3));     // Output: III
        System.out.println(intToRoman(4));     // Output: IV
        System.out.println(intToRoman(9));     // Output: IX
        System.out.println(intToRoman(58));    // Output: LVIII
        System.out.println(intToRoman(1994));  // Output: MCMXCIV
    }
}

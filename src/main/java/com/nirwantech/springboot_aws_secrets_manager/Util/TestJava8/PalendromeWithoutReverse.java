package com.nirwantech.springboot_aws_secrets_manager.Util.TestJava8;

public class PalendromeWithoutReverse {


    public String isPalindromeCheck(String original) {
        original = original.toLowerCase();

        String future = "";

        for (int i = 0; i < original.length(); i++) {
            future = original.charAt(i) + future;
        }

        if (original.equals(future)){
            System.out.println("Given String is Palindrome!");
        }else {
            System.out.println("Given String is not Palindrome!");
        }


        // Compare original and reversed
        return future;
    }

    public static void main(String[] args) {
        String input = "Madamam";
        PalendromeWithoutReverse obj=new PalendromeWithoutReverse();

System.out.println("isPalindromeCheck"+ obj.isPalindromeCheck(input));

}

}

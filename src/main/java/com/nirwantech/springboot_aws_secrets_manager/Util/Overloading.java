package com.nirwantech.springboot_aws_secrets_manager.Util;

public class Overloading {

    static int add(int a, int b) { return a + b; }

    static double add(double a, double b, double c)
    {
        return a + b + c;
    }

    // Main Function
    public static void main(String args[])
    {
        System.out.println("add() with 2 parameters");

        // Calling function with 2 parameters
        System.out.println(add(4, 6));

        System.out.println("add() with 3 parameters");

        // Calling function with 3 Parameters
        System.out.println(add(4, 6, 7));
    }
}
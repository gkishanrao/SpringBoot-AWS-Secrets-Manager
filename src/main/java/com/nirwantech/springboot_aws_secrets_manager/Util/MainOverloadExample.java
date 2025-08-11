package com.nirwantech.springboot_aws_secrets_manager.Util;
public class MainOverloadExample {

    // This is the standard main method used by JVM
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        main(10); // Calling overloaded version
        main("Hello");
    }

    public static void main(int num) {
        System.out.println("Overloaded main with int: " + num);
    }

    public static void main(String message) {
        System.out.println("Overloaded main with String: " + message);
    }
}

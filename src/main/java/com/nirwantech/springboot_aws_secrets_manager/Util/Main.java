package com.nirwantech.springboot_aws_secrets_manager.Util;


public class Main {
    public static void main(String[] args) {
        // Creating a new Person record instance
        Person person = new Person("John Doe", 28);

        // Accessing record fields
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
    }
}

// Define the record (compact data class)
record Person(String name, int age) {}

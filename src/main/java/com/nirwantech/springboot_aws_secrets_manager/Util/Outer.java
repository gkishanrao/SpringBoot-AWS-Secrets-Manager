package com.nirwantech.springboot_aws_secrets_manager.Util;
public class Outer {
    private String message = "Hello from Outer";

    class Inner {
        void printMessage() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printMessage();
    }
}
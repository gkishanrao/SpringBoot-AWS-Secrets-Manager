package com.nirwantech.springboot_aws_secrets_manager.Util;

interface  Calculator{
    void switchOn();

}
public class FunctionalInterface {
public static void main(String[] arg) {

    Calculator calculator = () -> System.out.println("SwitchOn");
calculator.switchOn();
}
}

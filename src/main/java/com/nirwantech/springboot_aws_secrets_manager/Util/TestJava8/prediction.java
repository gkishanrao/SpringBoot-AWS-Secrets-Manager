package com.nirwantech.springboot_aws_secrets_manager.Util.TestJava8;

import java.util.function.Predicate;

public class prediction {
    public static void main(String[] args){
        Predicate<String> string = s->s.length()>5;
        System.out.print("result="+string.test("Goodmorning"));
    }
}

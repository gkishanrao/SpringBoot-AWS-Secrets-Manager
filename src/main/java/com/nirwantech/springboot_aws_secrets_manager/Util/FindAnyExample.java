package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "JavaScript", "Julia");

        Optional<String> any = list.stream()
                .filter(s -> s.startsWith("J"))
                .findAny();

        any.ifPresent(System.out::println); // Output: Could be Java, JavaScript, or Julia
    }
}
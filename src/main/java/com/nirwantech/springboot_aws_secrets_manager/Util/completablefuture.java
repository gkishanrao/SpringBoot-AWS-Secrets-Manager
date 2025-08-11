package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class completablefuture {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a CompletableFuture with custom executor
        CompletableFuture<Void> future = CompletableFuture
                .supplyAsync(() -> "Java")
                .thenApply(str -> str + " is")
                .thenApply(str -> str + " powerful!")
                .thenAccept(System.out::println); // returns CompletableFuture<Void>

        future.get(); // Wait for completion

        executor.shutdown();
    }
}

package com.googlecode.practicemyjava.java9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class ImprovedCompletableFuture {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImprovedCompletableFuture.class);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Executor executor = CompletableFuture.delayedExecutor(5L, TimeUnit.SECONDS);
        executor.execute(() -> LOGGER.info("delayed start"));
        Thread.sleep(8000L);

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(ImprovedCompletableFuture::runThis);
        future.thenAccept(i -> LOGGER.info("{}", i));
        future.completeOnTimeout(-1, 2, TimeUnit.SECONDS);
        Thread.sleep(4000L);
    }

    private static int runThis() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            LOGGER.error("Error", e);
        }
        return 10;
    }
}

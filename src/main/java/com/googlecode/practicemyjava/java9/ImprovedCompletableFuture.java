package com.googlecode.practicemyjava.java9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

public class ImprovedCompletableFuture {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImprovedCompletableFuture.class);

    public static void main(String[] args) throws InterruptedException {
        Executor executor = CompletableFuture.delayedExecutor(5L, TimeUnit.SECONDS);
        executor.execute(() -> LOGGER.info("delayed start"));

        Thread.sleep(8000L);
    }
}

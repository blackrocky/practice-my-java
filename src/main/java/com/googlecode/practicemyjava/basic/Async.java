package com.googlecode.practicemyjava.basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Async {
    public static void main(String[] args) {
        CompletableFuture<List<Integer>> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("T1 " + Thread.currentThread());
            sleep(3000);
            return Arrays.asList(1, 2, 3, 4, 5, 6);
        });
        CompletableFuture<List<Integer>> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("T2 " + Thread.currentThread());
            sleep(1000);
            return Arrays.asList(7, 8, 9, 10);
        });

        List<Integer> collect = Stream.of(future1, future2)
                .map(CompletableFuture::join)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(collect);

        int max = Stream.of(future1, future2)
                .map(CompletableFuture::join)
                .flatMap(Collection::stream)
                .flatMapToInt(l -> IntStream.of(l))
                .max()
                .getAsInt();
        System.out.println(max);
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

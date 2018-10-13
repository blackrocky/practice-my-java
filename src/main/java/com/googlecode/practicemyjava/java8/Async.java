package com.googlecode.practicemyjava.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
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
        CompletableFuture<List<Integer>> future3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("T2 " + Thread.currentThread());
            sleep(5000);
            return Arrays.asList(11, 12, 13, 14, 15);
        });

        List<Integer> collect = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(collect);

        int max = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .flatMap(Collection::stream)
                .flatMapToInt(IntStream::of)
                .max()
                .getAsInt();
        System.out.println(max);

        try {
            List<Integer> combined = future1
                    .thenCombine(future2, (l1, l2) -> {
                        List<Integer> all = new ArrayList<>();
                        all.addAll(l1);
                        all.addAll(l2);
                        return all;
                    })
                    .thenCombine(future3, (l2, l3) -> {
                        List<Integer> all = new ArrayList<>();
                        all.addAll(l2);
                        all.addAll(l3);
                        return all;
                    })
                    .get();
            System.out.println(combined);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
package com.googlecode.practicemyjava.java9.improvedstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class DropWhile {
    private static final Logger LOGGER = LoggerFactory.getLogger(DropWhile.class);

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1);
        stream.dropWhile(i -> i < 3)
                .forEach(i -> LOGGER.info("{}", i));
    }
}

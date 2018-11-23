package com.googlecode.practicemyjava.java8.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class Skip {
    private static final Logger LOGGER = LoggerFactory.getLogger(Skip.class);

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1);
        stream.skip(2)
                .forEach(i -> LOGGER.info("{}", i));
    }
}

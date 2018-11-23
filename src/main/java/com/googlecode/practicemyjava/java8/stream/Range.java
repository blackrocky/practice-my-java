package com.googlecode.practicemyjava.java8.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class Range {
    private static final Logger LOGGER = LoggerFactory.getLogger(Range.class);

    public static void main(String[] args) {
        IntStream.range(0, 5)
                .forEach(i -> LOGGER.info("{}", i));

        IntStream.rangeClosed(0, 5)
                .forEach(i -> LOGGER.info("{}", i));
    }
}

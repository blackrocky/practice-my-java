package com.googlecode.practicemyjava.java8.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class IterateStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(IterateStream.class);

    public static void main(String[] args) {
        IntStream.iterate(2, x -> x * x)
                .limit(20)
                .filter(x -> x > 0)
                .forEach(x -> LOGGER.info("{}", x));
    }
}

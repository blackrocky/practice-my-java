package com.googlecode.practicemyjava.java9.improvedstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class IterateStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(IterateStream.class);

    public static void main(String[] args) {
        IntStream.iterate(2, x -> x < 20, x -> x * x).forEach(x -> LOGGER.info("{}", x));
    }
}

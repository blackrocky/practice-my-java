package com.googlecode.practicemyjava.java9.improvedstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class OfNullable {
    private static final Logger LOGGER = LoggerFactory.getLogger(OfNullable.class);

    public static void main(String[] args) {
        Stream.ofNullable(1).forEach(x -> LOGGER.info("{}", x));
        Stream.ofNullable(null).forEach(x -> LOGGER.info("{}", x));
    }
}

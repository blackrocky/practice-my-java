package com.googlecode.practicemyjava.java7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumericLiteralsWithUnderscores {
    private static final Logger LOGGER = LoggerFactory.getLogger(NumericLiteralsWithUnderscores.class);

    public static void main(String[] args) {
        int number = 1_000_000;
        LOGGER.info("number: {}", number);
    }
}

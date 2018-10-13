package com.googlecode.practicemyjava.java9.improvedoptional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class OptionalOr {
    private static final Logger LOGGER = LoggerFactory.getLogger(OptionalOr.class);

    public static void main(String[] args) {
        Optional<String> holly = Optional.of("Holly");
        Optional<String> staff1 = holly.or(() -> Optional.of("Emma"));
        LOGGER.info("Staff1: {}", staff1.get());

        Optional<String> empty = Optional.empty();
        Optional<String> staff2 = empty.or(() -> Optional.of("Emma"));
        LOGGER.info("Staff2: {}", staff2.get());
    }
}

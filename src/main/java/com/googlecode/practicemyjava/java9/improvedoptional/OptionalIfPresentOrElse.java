package com.googlecode.practicemyjava.java9.improvedoptional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class OptionalIfPresentOrElse {
    private static final Logger LOGGER = LoggerFactory.getLogger(OptionalIfPresentOrElse.class);

    public static void main(String[] args) {
        orderAppleJuice("green").ifPresentOrElse(
                result -> LOGGER.info("Response: {}", result),
                () -> LOGGER.info("None"));

        orderAppleJuice("red").ifPresentOrElse(
                result -> LOGGER.info("Response: {}", result),
                () -> LOGGER.info("None"));
    }

    private static Optional<String> orderAppleJuice(String type) {
        if ("green".equalsIgnoreCase(type)) {
            return Optional.of("Green Apple");
        }
        return Optional.empty();
    }
}

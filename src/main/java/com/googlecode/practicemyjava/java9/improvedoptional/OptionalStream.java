package com.googlecode.practicemyjava.java9.improvedoptional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(OptionalStream.class);

    public static void main(String[] args) {
        Stream<Optional<String>> staff = getStaff(10);
        staff.flatMap(Optional::stream).forEach(s -> LOGGER.info("Staff name: {}", s));
    }

    private static Stream<Optional<String>> getStaff(int i) {
        return Stream.of(Optional.of("John"), Optional.of("Amanda"));
    }
}

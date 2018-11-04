package com.googlecode.practicemyjava.java10;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class OrElseThrow {
    public static void main(String[] args) {
        Optional<String> maybeResult1 = Optional.of("result");
        String result1 = maybeResult1.orElseThrow(() -> new RuntimeException("result not found"));
        log.info("result1: {}", result1);

        Optional<String> maybeResult2 = Optional.empty();
        try {
            String result2 = maybeResult2.orElseThrow();
        } catch (Exception e) {
            log.error("Can't add to unmodifiable list");
        }
    }
}

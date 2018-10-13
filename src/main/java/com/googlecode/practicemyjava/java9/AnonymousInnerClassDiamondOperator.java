package com.googlecode.practicemyjava.java9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnonymousInnerClassDiamondOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(AnonymousInnerClassDiamondOperator.class);

    public static void main(String[] args) {
        Diamond<String> diamond = new Diamond<>() {
            @Override
            public void run(String string) {
                LOGGER.info("Run {}", string);
            }

            @Override
            public void print(String string) {
                LOGGER.info("Print {}", string);
            }
        };

        diamond.run("hi");
        diamond.print("hello");
    }
}

interface Diamond<T> {
    void run(T string);
    void print(T string);
}

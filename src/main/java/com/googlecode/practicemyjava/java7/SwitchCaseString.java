package com.googlecode.practicemyjava.java7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwitchCaseString {
    private static final Logger LOGGER = LoggerFactory.getLogger(SwitchCaseString.class);

    public static void main(String[] args) {
        final String s = "str";
        switch (s) {
            case "abc":
                LOGGER.info("abc");
                break;
            case "str":
                LOGGER.info("str");
                break;
            default:
                LOGGER.info("default");
        }
    }
}

package com.googlecode.practicemyjava.java7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwitchCaseString {
    private static final Logger logger = LoggerFactory.getLogger(SwitchCaseString.class);

    public static void main(String[] args) {
        final String s = "str";
        switch (s) {
            case "abc":
                logger.info("abc");
                break;
            case "str":
                logger.info("str");
                break;
            default:
                logger.info("default");
        }
    }
}

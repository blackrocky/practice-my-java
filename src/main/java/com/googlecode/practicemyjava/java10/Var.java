package com.googlecode.practicemyjava.java10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Var {
    private static final Logger LOGGER = LoggerFactory.getLogger(Var.class);

    public static void main(String[] args) {
        var fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Blueberry");
        LOGGER.info("Fruits: {}", fruits);

        var index = 0;
        LOGGER.info("First one: {}", fruits.get(index));
    }
}

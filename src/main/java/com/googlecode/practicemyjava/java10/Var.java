package com.googlecode.practicemyjava.java10;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class Var {
    public static void main(String[] args) {
        var fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Blueberry");
        log.info("Fruits: {}", fruits);

        var index = 0;
        log.info("First one: {}", fruits.get(index));

        // Invalid use of vars:
        /*
        var i;
        var j, k = 5;
        var l = null;
        */
    }
}

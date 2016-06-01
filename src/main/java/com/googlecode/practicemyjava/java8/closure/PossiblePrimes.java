package com.googlecode.practicemyjava.java8.closure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.IntFunction;

import static com.google.common.collect.Lists.newArrayList;

public class PossiblePrimes {
    private static final Logger LOGGER = LoggerFactory.getLogger(PossiblePrimes.class);

    private static List<Integer> applyForEach(List<Integer> inputs, IntFunction<Integer> function) {
        List<Integer> result = newArrayList();
        for (int input : inputs) {
            result.add(function.apply(input));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> primes = newArrayList(1, 2, 3, 5, 7, 11, 13, 17, 19, 23);
        List<Integer> possiblePrimes = applyForEach(primes, value -> value * 2 - 1);
        LOGGER.info("possiblePrimes {}", possiblePrimes);
    }
}

package com.googlecode.practicemyjava.java8.closure;

import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

public class FunctionForIntegerListTest {
    @Test
    public void shouldProduceListWithMultiplyByTwoMinusOneFunction() {
        List<Integer> primes = newArrayList(1, 2, 3, 5, 7, 11, 13, 17, 19, 23);
        List<Integer> possiblePrimes = FunctionForIntegerList.applyForEach(primes, value -> value * 2 - 1);
        assertThat(possiblePrimes, hasItems(1, 3, 5, 9, 13, 21, 25, 33, 37, 45));
    }

    @Test
    public void shouldProduceListWithMultiplyBy2Function() {
        List<Integer> primes = newArrayList(1, 2, 3, 5, 7, 11, 13, 17, 19, 23);
        List<Integer> possiblePrimes = FunctionForIntegerList.applyForEach(primes, value -> value * 2);
        assertThat(possiblePrimes, hasItems(2, 4, 6, 10, 14, 22, 26, 34, 38, 46));
    }
}
package com.googlecode.practicemyjava.basic;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FibonacciTest {
    @Test
    public void should_create_fibonacci_numbers() {
        Fibonacci f = new Fibonacci(10);

        assertThat(f.getNthNumber(1), is(0));
        assertThat(f.getNthNumber(2), is(1));
        assertThat(f.getNthNumber(3), is(1));
        assertThat(f.getNthNumber(4), is(2));
        assertThat(f.getNthNumber(5), is(3));
        assertThat(f.getNthNumber(6), is(5));
        assertThat(f.getNthNumber(7), is(8));
        assertThat(f.getNthNumber(8), is(13));
        assertThat(f.getNthNumber(9), is(21));
        assertThat(f.getNthNumber(10), is(34));
    }
}
package com.googlecode.practicemyjava.util;

import org.junit.Test;

import static com.googlecode.practicemyjava.util.Pair.pair;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class PairTest {
    @Test
    public void should_return_null_key_values_for_default_constructor() {
    	Pair<Integer, Double> pair = new Pair<>();

        assertThat(pair.getKey(), nullValue());
        assertThat(pair.getValue(), nullValue());
    }

    @Test
    public void should_return_pair() {
    	Pair<Integer, String> pair = pair(1, "abc");

        assertThat(pair.getKey(), is(1));
        assertThat(pair.getValue(), is("abc"));
        assertThat(pair.toString(), is("Pair[key=1,value=abc]"));
    }

    @Test
    public void should_return_correct_equal_result() {
        Pair<String, Integer> pair1 = pair("a", 1);
        Pair<String, Integer> pair2 = pair("a", 1);
        Pair<String, Integer> pair3 = pair("b", 2);

        assertThat(pair1.equals(pair2), is(true));
        assertThat(pair1.equals(pair3), is(false));

        assertThat(pair2.equals(pair1), is(true));
        assertThat(pair2.equals(pair3), is(false));

        assertThat(pair3.equals(pair1), is(false));
        assertThat(pair3.equals(pair2), is(false));
    }
}
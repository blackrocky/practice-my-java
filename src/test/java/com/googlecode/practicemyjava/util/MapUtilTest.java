package com.googlecode.practicemyjava.util;

import org.junit.Test;

import java.util.Map;

import static com.googlecode.practicemyjava.util.MapUtil.entry;
import static com.googlecode.practicemyjava.util.MapUtil.map;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MapUtilTest {
    @Test
    public void shouldCreateMapOfStringInteger() {
    	final Map<String, Integer> map = map(entry("a", 1), entry("b", 2), entry("c", 3));
        assertThat(map.size(), is(3));
        assertThat(map.get("a"), is(1));
        assertThat(map.get("b"), is(2));
        assertThat(map.get("c"), is(3));
    }

    @Test
    public void shouldCreateMapOfIntegerString() throws Exception {
        final Map<Integer, String> map = map(entry(1, "a"), entry(2, "b"), entry(3, "c"), entry(4, "d"));
        assertThat(map.size(), is(4));
        assertThat(map.get(1), is("a"));
        assertThat(map.get(2), is("b"));
        assertThat(map.get(3), is("c"));
        assertThat(map.get(4), is("d"));
    }
}
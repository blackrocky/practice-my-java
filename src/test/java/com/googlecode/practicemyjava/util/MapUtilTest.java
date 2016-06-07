package com.googlecode.practicemyjava.util;

import org.junit.Test;

import java.util.Map;

import static com.googlecode.practicemyjava.util.MapUtil.entry;
import static com.googlecode.practicemyjava.util.MapUtil.map;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MapUtilTest {
    @Test
    public void shouldCreateMap() {
    	final Map<String, Integer> map = map(entry("a", 1), entry("b", 2), entry("c", 3));
        assertThat(map.size(), is(3));
        assertThat(map.get("a"), is(1));
        assertThat(map.get("b"), is(2));
        assertThat(map.get("c"), is(3));
    }
}
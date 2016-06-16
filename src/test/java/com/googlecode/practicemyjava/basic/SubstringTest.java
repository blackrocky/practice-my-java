package com.googlecode.practicemyjava.basic;

import org.junit.Test;

import static com.googlecode.practicemyjava.basic.Substring.isSubstring;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SubstringTest {
    @Test
    public void should_return_true_given_substring_exists() throws Exception {
        assertThat(isSubstring("cde", "abcdefg"), is(true));
    }

    @Test
    public void should_return_false_given_substring_longer_than_string() throws Exception {
        assertThat(isSubstring("abcdfasdf", "aaz"), is(false));
    }

    @Test
    public void should_return_false_given_null_substring() throws Exception {
        assertThat(isSubstring(null, "aaa"), is(false));
    }

    @Test
    public void should_return_false_given_null_string() throws Exception {
        assertThat(isSubstring("abc", null), is(false));
    }

    @Test
    public void should_return_false_given_null_substring_and_string() throws Exception {
        assertThat(isSubstring(null, null), is(false));
    }

    @Test
    public void should_return_false_given_substring_does_not_exist() throws Exception {
        assertThat(isSubstring("zzx", "asdfzzydf"), is(false));
    }
}
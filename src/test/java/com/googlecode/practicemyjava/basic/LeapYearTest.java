package com.googlecode.practicemyjava.basic;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LeapYearTest {

    @Test
    public void testIsLeapYear() throws Exception {
        assertThat(LeapYear.isLeapYear(200), is(false));
        assertThat(LeapYear.isLeapYear(204), is(true));
        assertThat(LeapYear.isLeapYear(1988), is(true));
        assertThat(LeapYear.isLeapYear(1992), is(true));
        assertThat(LeapYear.isLeapYear(1996), is(true));
        assertThat(LeapYear.isLeapYear(2000), is(true));
        assertThat(LeapYear.isLeapYear(2004), is(true));
        assertThat(LeapYear.isLeapYear(2008), is(true));
        assertThat(LeapYear.isLeapYear(2012), is(true));
        assertThat(LeapYear.isLeapYear(2016), is(true));
    }
}
package com.googlecode.practicemyjava.java8.interfaces;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ShinkansenTest {
    private static final Logger logger = LoggerFactory.getLogger(ShinkansenTest.class);

    @Test
    public void should_have_250_as_max_speed_with_close_door_announcement() {
        final Shinkansen1Interface shinkansen1 = new SakuraShinkansen();
        assertThat(shinkansen1.go1(), is("go1 implementation"));
        assertThat(shinkansen1.maximumSpeedInKmH(), is(250));
        assertThat(shinkansen1.closeDoorAnnouncement(), is("Door ga shimarimas"));
    }

    @Test
    public void should_have_250_as_max_speed_with_next_station_announcement() {
        final Shinkansen2Interface shinkansen2 = new SakuraShinkansen();
        assertThat(shinkansen2.go2(), is("go2 implementation"));
        assertThat(shinkansen2.maximumSpeedInKmH(), is(250));
        assertThat(shinkansen2.nextStationAnnouncement(), is("Tsugi wa"));
    }

    @Test
    public void should_have_300_as_max_speed_for_nozomi_shinkansen() {
        final Shinkansen2Interface shinkansen = new NozomiShinkansen();
        assertThat(shinkansen.go2(), is("go2 implementation"));
        assertThat(shinkansen.maximumSpeedInKmH(), is(300));
        assertThat(shinkansen.nextStationAnnouncement(), is("Tsugi wa"));
    }

    @Test
    public void should() throws Exception {
    	final Shinkansen1Interface shinkansen = () -> { return "my own go1 implementation"; };
        assertThat(shinkansen.go1(), is("my own go1 implementation"));
    }
}

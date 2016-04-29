package com.googlecode.practicemyjava.java8.interfaces;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ShinkansenTest {
    @Test
    public void should_have_250_as_max_speed_with_close_door_announcement() {
        final Shinkansen1Interface shinkansen1 = new SakuraShinkansen();
        assertThat(shinkansen1.maximumSpeedInKmH(), is(250));
        assertThat(shinkansen1.closeDoorAnnouncement(), is("Door ga shimarimas"));
    }

    @Test
    public void should_have_250_as_max_speed_with_next_door_announcement() {
        final Shinkansen2Interface shinkansen2 = new SakuraShinkansen();
        assertThat(shinkansen2.maximumSpeedInKmH(), is(250));
        assertThat(shinkansen2.nextStationAnnouncement(), is("Tsugi wa"));
    }

    @Test
    public void testNozomiShinkansen() {
        final Shinkansen2Interface shinkansen = new NozomiShinkansen();
        assertThat(shinkansen.maximumSpeedInKmH(), is(300));
        assertThat(shinkansen.nextStationAnnouncement(), is("Tsugi wa"));
    }
}

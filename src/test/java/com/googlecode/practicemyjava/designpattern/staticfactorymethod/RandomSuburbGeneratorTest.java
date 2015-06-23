package com.googlecode.practicemyjava.designpattern.staticfactorymethod;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RandomSuburbGeneratorTest {
    private Logger LOGGER = LoggerFactory.getLogger(RandomSuburbGeneratorTest.class);

    @Test
    public void should_generate_random_suburb() {
        String nswSuburb = RandomSuburbGenerator.fromState(RandomSuburbGenerator.State.NSW).generate();
        String citySuburb = RandomSuburbGenerator.fromType(RandomSuburbGenerator.Type.CITY).generate();

        LOGGER.debug("generating suburb name");
        assertThat(nswSuburb, is("Epping in NSW of type RANDOM"));
    }
}
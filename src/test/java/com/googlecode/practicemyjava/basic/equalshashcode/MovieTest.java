package com.googlecode.practicemyjava.basic.equalshashcode;

import org.junit.Test;

import java.util.Set;

import static com.google.common.collect.Sets.newHashSet;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MovieTest {
    private final Set<Movie> dcMovies = newHashSet(new DCMovie("Man of Steel"), new DCMovie("Batman v Superman"));
    private final Set<Movie> marvelMovies = newHashSet(new MarvelMovie("Ant Man"), new MarvelMovie("Captain America Civil War"));

    @Test
    public void should_not_contain_man_of_steel_movie_because_equals_hashcode_are_not_implemented() throws Exception {
    	final Movie manOfSteelMovie = new DCMovie("Man of Steel");
        assertThat(dcMovies.contains(manOfSteelMovie), is(false));
    }

    @Test
    public void should_contain_ant_man_movie_because_equals_hashcode_are_implemented() throws Exception {
    	final Movie antManMovie = new MarvelMovie("Ant Man");
        assertThat(marvelMovies.contains(antManMovie), is(true));
    }
}
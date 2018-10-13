package com.googlecode.practicemyjava.java8.stream;

import com.google.common.collect.ImmutableList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachList {
    private static final Logger LOGGER = LoggerFactory.getLogger(ForEachList.class);
    private static final List<String> japaneseCitiesToVisit = ImmutableList.of("Fukuoka", "Hiroshima", "Kanazawa", "Takayama", "Nagoya", "Tokyo");
    private static final List<Integer> numbers = ImmutableList.of(1, 2, 3, 4, 5, 6);

    public static void main(String[] args) {
        LOGGER.info("Traversing using forEach and anonymous class");
        japaneseCitiesToVisit.forEach(t -> LOGGER.info("{}", t));
        LOGGER.info("-------------------------------------------------");

        LOGGER.info("Traversing using Consumer implementation");
        final MyConsumer action = new MyConsumer();
        japaneseCitiesToVisit.forEach(action);
        LOGGER.info("-------------------------------------------------");

        LOGGER.info("Using sequential and parallel streams");
        final Stream<Integer> sequentialStream = numbers.stream();
        final Stream<Integer> parallelStream = numbers.parallelStream();

        sequentialStream.filter(p -> p > 2).forEach(p -> LOGGER.info("sequential numbers = {}", p));
        parallelStream.filter(p -> p > 2).forEach(p -> LOGGER.info("parallel numbers = {}", p));
    }
}

class MyConsumer implements Consumer<String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyConsumer.class);

    public void accept(final String t) {
        LOGGER.info("{}", t);
    }
}

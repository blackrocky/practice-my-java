package com.googlecode.practicemyjava.java8.stream;

import com.google.common.collect.ImmutableList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachList {
    private static final Logger logger = LoggerFactory.getLogger(ForEachList.class);
    private static final List<String> japaneseCitiesToVisit = ImmutableList.of("Fukuoka", "Hiroshima", "Kanazawa", "Takayama", "Nagoya", "Tokyo");
    private static final List<Integer> numbers = ImmutableList.of(1, 2, 3, 4, 5, 6);

    public static void main(String[] args) {
        logger.info("Traversing using forEach and anonymous class");
        japaneseCitiesToVisit.forEach(new Consumer<String>() {
            public void accept(String t) {
                logger.info("{}", t);
            }
        });
        logger.info("-------------------------------------------------");

        logger.info("Traversing using Consumer implementation");
        final MyConsumer action = new MyConsumer();
        japaneseCitiesToVisit.forEach(action);
        logger.info("-------------------------------------------------");

        logger.info("Using sequential and parallel streams");
        final Stream<Integer> sequentialStream = numbers.stream();
        final Stream<Integer> parallelStream = numbers.parallelStream();

        sequentialStream.filter(p -> p > 2).forEach(p -> logger.info("sequential numbers = {}", p));
        parallelStream.filter(p -> p > 2).forEach(p -> logger.info("parallel numbers = {}", p));
    }
}

class MyConsumer implements Consumer<String> {
    private static final Logger logger = LoggerFactory.getLogger(MyConsumer.class);

    public void accept(String t) {
        logger.info("{}", t);
    }
}

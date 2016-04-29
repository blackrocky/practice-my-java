package com.googlecode.practicemyjava.java8;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Consumer;

public class ForEachList {
    private static final Logger logger = LoggerFactory.getLogger(ForEachList.class);

    public static void main(String[] args) {
        final List<String> japaneseCities = Lists.newArrayList("Fukuoka", "Hiroshima", "Kanazawa", "Takayama", "Nagoya", "Tokyo");

        logger.info("Traversing using forEach and anonymous class");
        japaneseCities.forEach(new Consumer<String>() {
            public void accept(String t) {
                logger.info("{}", t);
            }
        });
        logger.info("-------------------------------------------------");

        logger.info("Traversing using Consumer implementation");
        final MyConsumer action = new MyConsumer();
        japaneseCities.forEach(action);
    }
}

class MyConsumer implements Consumer<String> {
    private static final Logger logger = LoggerFactory.getLogger(MyConsumer.class);

    public void accept(String t) {
        logger.info("{}", t);
    }
}
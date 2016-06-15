package com.googlecode.practicemyjava.designpattern.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class SingletonStatic implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(SingletonStatic.class);
    private static final SingletonStatic INSTANCE = new SingletonStatic();

    public SingletonStatic() {
        LOGGER.info("inside singleton static constructor");
        // do not create any instance
    }

    private Object readResolve() {
        LOGGER.info("inside readResolve method");
        // This is so that serialization does not create new instance
        return INSTANCE;
    }

    public static SingletonStatic getInstance() {
        LOGGER.info("returning static instance");
        return INSTANCE;
    }
}

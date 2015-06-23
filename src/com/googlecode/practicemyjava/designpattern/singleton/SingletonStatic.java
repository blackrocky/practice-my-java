package com.googlecode.practicemyjava.designpattern.singleton;

import java.io.Serializable;

public class SingletonStatic implements Serializable {
    public static final SingletonStatic INSTANCE = new SingletonStatic();

    public SingletonStatic() {
        // do not create any instance
    }

    private Object readResolve() {
        // This is so that serialization does not create new instance
        return INSTANCE;
    }
}

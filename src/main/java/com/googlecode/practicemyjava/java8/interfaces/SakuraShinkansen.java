package com.googlecode.practicemyjava.java8.interfaces;

public class SakuraShinkansen implements Shinkansen1Interface, Shinkansen2Interface {
    @Override
    public void go1() {
        // go1 implementation goes here
    }

    @Override
    public void go2() {
        // go2 implementation goes here
    }

    @Override
    public int maximumSpeedInKmH() {
        return 250;
    }
}

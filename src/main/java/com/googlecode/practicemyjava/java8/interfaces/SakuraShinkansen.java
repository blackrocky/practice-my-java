package com.googlecode.practicemyjava.java8.interfaces;

public class SakuraShinkansen implements Shinkansen1Interface, Shinkansen2Interface {
    @Override
    public String go1() {
        return "go1 implementation";
    }

    @Override
    public String go2() {
        return "go2 implementation";
    }

    @Override
    public int maximumSpeedInKmH() {
        return 250;
    }
}

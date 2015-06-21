package com.googlecode.practicemyjava.designpattern.staticfactorymethod;

public class Main {
    public static void main(String[] args) {
        String nswSuburb = RandomSuburbGenerator.fromState(RandomSuburbGenerator.State.NSW).generate();
        String citySuburb = RandomSuburbGenerator.fromType(RandomSuburbGenerator.Type.CITY).generate();
    }
}

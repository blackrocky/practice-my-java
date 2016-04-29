package com.googlecode.practicemyjava.java8.interfaces;

@FunctionalInterface
public interface Shinkansen2Interface {
    String go2();
    default int maximumSpeedInKmH() {
        return 300;
    }
    default String nextStationAnnouncement() {
        return "Tsugi wa";
    }
}

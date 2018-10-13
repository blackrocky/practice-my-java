package com.googlecode.practicemyjava.java9;

@FunctionalInterface
public interface PrivateMethodInterface {
    String go1();
    default int maximumSpeedInKmH() { return 200; }
    default String closeDoorAnnouncement() { return "Door ga shimarimas"; }
    default String hello() { return konichiwa(); }
    default String hi() { return konichiwa(); }

    private static String konichiwa() {
        return "Konichiwa";
    }
}

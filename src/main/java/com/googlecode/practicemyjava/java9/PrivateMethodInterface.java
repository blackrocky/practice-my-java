package com.googlecode.practicemyjava.java9;

@FunctionalInterface
public interface PrivateMethodInterface {
    String go1();
    default int maximumSpeedInKmH() { return 200; }
    default String closeDoorAnnouncement() { return "Door ga shimarimas"; }
    default String hello() { return konichiwa(); }
    default String hi() { return konichiwa(); }
    static String morning() { return ohayo(); }

    private String konichiwa() {
        return "Konichiwa";
    }

    private static String ohayo() {
        return "Ohayo";
    }
}

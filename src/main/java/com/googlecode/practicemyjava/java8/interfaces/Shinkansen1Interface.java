package com.googlecode.practicemyjava.java8.interfaces;

@FunctionalInterface
public interface Shinkansen1Interface {
    String go1();
    default int maximumSpeedInKmH() { return 200; }
    default String closeDoorAnnouncement() { return "Door ga shimarimas"; }
    default String hello() { return "Konichiwa"; }
    default String hi() { return "Konichiwa"; }
}

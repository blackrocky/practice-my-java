package com.googlecode.practicemyjava.java8.interfaces;

@FunctionalInterface
public interface Shinkansen1Interface {
    void go1();
    default int maximumSpeedInKmH() { return 200; }
    default String closeDoorAnnouncement() { return "Door ga shimarimas"; }
}

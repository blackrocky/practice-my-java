package com.googlecode.practicemyjava.java7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AutomaticResourceManagement {
    private static final Logger LOGGER = LoggerFactory.getLogger(AutomaticResourceManagement.class);

    public static void main(String[] args) {
        try (final BufferedReader bf = Files.newBufferedReader(Paths.get("./src/main/resources/MyPracticeFile.txt"))) {
            LOGGER.info(bf.readLine());
        } catch (IOException ex) {
            LOGGER.error("error reading file", ex);
        }
    }
}

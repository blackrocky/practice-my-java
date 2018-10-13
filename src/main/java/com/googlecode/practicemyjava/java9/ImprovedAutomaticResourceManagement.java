package com.googlecode.practicemyjava.java9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImprovedAutomaticResourceManagement {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImprovedAutomaticResourceManagement.class);

    public static void main(String[] args) throws IOException {
        final BufferedReader bf = Files.newBufferedReader(Paths.get("./src/main/resources/MyPracticeFile.txt"));
        try (bf) {
            LOGGER.info(bf.readLine());
        }
    }
}

package com.googlecode.practicemyjava.java7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesNIO {
    private static final Logger LOGGER = LoggerFactory.getLogger(FilesNIO.class);

    public static void main(String[] args) {
        final Path path = Paths.get("./src/main/resources/MyPracticeFile.txt");

        LOGGER.info("File name {}", path.getFileName());
        LOGGER.info("Parent {}", path.getParent());
        LOGGER.info("Root {}", path.getRoot());
    }
}

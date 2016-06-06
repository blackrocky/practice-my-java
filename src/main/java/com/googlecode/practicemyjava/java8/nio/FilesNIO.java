package com.googlecode.practicemyjava.java8.nio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesNIO {
    private static final Logger LOGGER = LoggerFactory.getLogger(FilesNIO.class);

    public static void main(String[] args) {
        final Path path = Paths.get("./src/main/resources/MyPracticeFile.txt");
        try {
            Files.walk(path).forEach((val) -> LOGGER.info(val.toString()));
        } catch (IOException e) {
            LOGGER.error("error walking path", e);
        }

        LOGGER.info("File name {}", path.getFileName());
        LOGGER.info("Parent {}", path.getParent());
        LOGGER.info("Root {}", path.getRoot());
    }
}

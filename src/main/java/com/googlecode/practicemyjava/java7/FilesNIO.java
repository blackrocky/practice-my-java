package com.googlecode.practicemyjava.java7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesNIO {
    private static final Logger logger = LoggerFactory.getLogger(FilesNIO.class);

    public static void main(String[] args) {
        final Path path = Paths.get("./src/main/resources/MyPracticeFile.txt");

        logger.info("File name {}", path.getFileName());
        logger.info("Parent {}", path.getParent());
        logger.info("Root {}", path.getRoot());
    }
}

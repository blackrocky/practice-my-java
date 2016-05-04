package com.googlecode.practicemyjava.java7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

public class FileWatcherMultiCatch {
    private static final Logger logger = LoggerFactory.getLogger(FileWatcherMultiCatch.class);

    public static void main(String[] args) {
        final Path path = Paths.get("./src/main/resources");

        try {
            while (true) {
                logger.info("Watching folder {}", path.getFileName());
                WatchService watcher = path.getFileSystem().newWatchService();
                path.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

                logger.info("watching folder");
                WatchKey watckKey = watcher.take();

                List<WatchEvent<?>> events = watckKey.pollEvents();
                for (WatchEvent event : events) {
                    if (event.kind() == ENTRY_CREATE) {
                        logger.info("Create event: {}", event.context().toString());
                    }
                    if (event.kind() == ENTRY_DELETE) {
                        logger.info("Delete event: {}", event.context().toString());
                    }
                    if (event.kind() == ENTRY_MODIFY) {
                        logger.info("Modify event: {}", event.context().toString());
                    }
                }
            }
        } catch (IOException | InterruptedException ex) {
            logger.error("Error: {} " + ex.toString(), ex);
        }
    }
}

package com.googlecode.practicemyjava.java7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.*;

public class FileWatcherMultiCatch {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileWatcherMultiCatch.class);

    public static void main(String[] args) {
        final Path path = Paths.get("./src/main/resources");

        try {
            while (true) {
                LOGGER.info("Watching folder {}", path.getFileName());
                WatchService watcher = path.getFileSystem().newWatchService();
                path.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

                LOGGER.info("watching folder");
                WatchKey watckKey = watcher.take();

                List<WatchEvent<?>> events = watckKey.pollEvents();
                for (WatchEvent event : events) {
                    if (event.kind() == ENTRY_CREATE) {
                        LOGGER.info("Create event: {}", event.context().toString());
                    }
                    if (event.kind() == ENTRY_DELETE) {
                        LOGGER.info("Delete event: {}", event.context().toString());
                    }
                    if (event.kind() == ENTRY_MODIFY) {
                        LOGGER.info("Modify event: {}", event.context().toString());
                    }
                }
            }
        } catch (IOException | InterruptedException ex) {
            LOGGER.error("Error: {} " + ex.toString(), ex);
        }
    }
}

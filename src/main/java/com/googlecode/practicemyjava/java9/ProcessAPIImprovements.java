package com.googlecode.practicemyjava.java9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessAPIImprovements {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessAPIImprovements.class);

    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        LOGGER.info("Current process id: {}", currentProcess.pid());
        LOGGER.info("Current process info: {}", currentProcess.info());
    }
}

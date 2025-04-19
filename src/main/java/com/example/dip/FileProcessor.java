package com.example.dip;

public class FileProcessor {
    private final Logger logger;

    public FileProcessor(Logger logger) {
        this.logger = logger;
    }

    public void processFile(String filePath) {
        logger.log("Processing file: " + filePath);
        System.out.println("File " + filePath + " processed.");
    }
}

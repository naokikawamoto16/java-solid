package com.example.dip;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        FileProcessor fileProcessor = new FileProcessor(logger);
        fileProcessor.processFile("example.txt");
    }
}

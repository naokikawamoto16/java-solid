package com.example.isp;

public class MultiCopier implements Printer, Scanner, Copier {
    public void print(Document document) { System.out.println("Printing: " + document.title()); }

    public void scan(Document document) {
        System.out.println("Scanning: " + document.title());
    }

    public void copy(Document document) {
        System.out.println("Copying: "  + document.title());
    }
}

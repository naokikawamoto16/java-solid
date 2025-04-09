package com.example.srp;

class Printer {
    public void print(Document document) {
        System.out.println("Printing document: " + document.title);
        System.out.println(document.content);
    }
}

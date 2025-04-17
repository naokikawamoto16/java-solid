package com.example.isp;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("My Document", "This is the content of the document.");

        MultiCopier multiCopier = new MultiCopier();
        multiCopier.print(document);
        multiCopier.scan(document);
        multiCopier.copy(document);
    }
}

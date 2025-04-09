package com.example.srp;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Sample Title", "Sample Content");

        Printer printer = new Printer();
        printer.print(document);

        System.out.println("---------------------------------");

        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(document, "tester");

        System.out.println("---------------------------------");

        CloudUploader cloudUploader = new CloudUploader();
        cloudUploader.upload(document);
    }
}

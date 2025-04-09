package com.example.srp;

class EmailSender {
    public void sendEmail(Document document, String recipient) {
        System.out.println("Sending email to: " + recipient);
        System.out.println("Subject: " + document.title);
        System.out.println("Content: " + document.content);
    }
}

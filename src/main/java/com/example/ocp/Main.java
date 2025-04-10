package com.example.ocp;

public class Main {
    public static void main(String[] args) {
        Product orange = new Orange(200);
        Product smartphone = new Smartphone(50000);
        Product shirt = new Shirt(1500);

        System.out.println("Orange tax: " + orange.calculateTax());
        System.out.println("Smartphone tax: " + smartphone.calculateTax());
        System.out.println("Shirt tax: " + shirt.calculateTax());
    }
}

package com.example.ocp;

public class Smartphone implements Product {
    private static final double TAX_RATE = 0.1;
    private final double price;

    public Smartphone(double price) {
        this.price = price;
    }

    public double calculateTax() {
        return price * TAX_RATE;
    }
}

package com.example.ocp;

public class Shirt implements Product {
    private static final double TAX_RATE = 0.1;
    private final double price;

    public Shirt(double price) {
        this.price = price;
    }

    public double calculateTax() {
        return price * TAX_RATE;
    }
}

package com.example.ocp;

public class Orange implements Product {
    private static final double TAX_RATE = 0.08;
    private final double price;

    public Orange(double price) {
        this.price = price;
    }

    public double calculateTax() {
        return price * TAX_RATE;
    }
}

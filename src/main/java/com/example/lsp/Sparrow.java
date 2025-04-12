package com.example.lsp;

class Sparrow extends Bird implements Flyable {
    public Sparrow() {
        super("Sparrow");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps.");
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }
}

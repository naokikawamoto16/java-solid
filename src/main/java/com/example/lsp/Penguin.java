package com.example.lsp;

class Penguin extends Bird implements Swimmable {
    public Penguin() {
        super("Penguin");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " squawks.");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

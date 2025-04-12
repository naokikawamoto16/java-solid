package com.example.lsp;

class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.makeSound();
        sparrow.fly();

        System.out.println("====================================");

        Penguin penguin = new Penguin();
        penguin.makeSound();
        penguin.swim();

        System.out.println("====================================");

        Swan swan = new Swan();
        swan.makeSound();
        swan.fly();
        swan.swim();
    }
}

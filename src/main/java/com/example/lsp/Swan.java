package com.example.lsp;

class Swan extends Bird implements Flyable, Swimmable {
    public Swan() {
        super("Swan");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " honks.");
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

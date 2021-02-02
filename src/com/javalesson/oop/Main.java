package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {

        Dog.getDogCount();

        Dog lab = new Dog();
        lab.setName("Charley");
        lab.setBreed("Lab");
        lab.setSize(Size.AVERAGE);
        lab.bite();

        Dog shepard = new Dog();
        shepard.setName("Mike");
        shepard.setBreed("Shepard");
        shepard.setSize(Size.BIG);
        shepard.bite();

        Dog doberman = new Dog();
        shepard.setName("Jack");
        shepard.setBreed("Doberman");
        shepard.setSize(Size.BIG);
        shepard.bite();
    }
}

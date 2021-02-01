package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {

        Dog.getDogCount();

        Dog lab = new Dog();
        lab.setPaws(4);
        lab.setTail(1);
        lab.setName("Charley");
        lab.setBreed("Lab");
        lab.setSize("Average");
        lab.bite();

        Dog shepard = new Dog();
        shepard.setPaws(4);
        shepard.setTail(1);
        shepard.setName("Mike");
        shepard.setBreed("Shepard");
        shepard.setSize("Big");
        shepard.bite();

        Dog doberman = new Dog();
        doberman.setPaws(4);
        shepard.setTail(1);
        shepard.setName("Jack");
        shepard.setBreed("Doberman");
        shepard.setSize("Big");
        shepard.bite();

        System.out.println("Lab's name is " + lab.getName());
        System.out.println("Shepard's name is " + shepard.getName());
    }
}

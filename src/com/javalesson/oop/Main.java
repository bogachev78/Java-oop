package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {
        Dog lab = new Dog();
        lab.setPaws(5);
        lab.setTail(2);
        lab.setName("Charley");
        lab.setBreed("Lab");

        Dog shepard = new Dog();
        shepard.setPaws(4);
        shepard.setTail(1);
        shepard.setName("Mike");
        shepard.setBreed("Shepard");

        System.out.println("Lab's name is " + lab.getName());
        System.out.println("Shepard's name is " + shepard.getName());
    }
}

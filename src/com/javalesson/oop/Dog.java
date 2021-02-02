package com.javalesson.oop;

public class Dog {

    private static int dogCount;

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;

    public Dog(){
        dogCount++;
        System.out.println("Dog's count is: " + dogCount);
    }

    public static int getDogCount(){
        return dogCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark(){
        switch (size){
            case BIG:case VERY_BIG:
                System.out.println("Wof-Wof");
                break;
            case AVERAGE:
                System.out.println("Raf-Raf");
                break;
            case SMALL:case VERY_SMALL:
                System.out.println("Tiaf-Tiaf");
                break;
            default:
                System.out.println("Dogs's size undefined");
        }
    }

    public void bite(){
        if(dogCount > 2){
            System.out.println("Dogs are biting you");
        }else{
            bark();
        }
    }
}

package com.javalesson.inheritance;

public class Auto {
    private String producer;
    private String model;
    private Engine engine;
    private int currentSpeed;
    protected boolean isRunning;

    public Auto(String producer, String model, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        System.out.println("Auto was initialized");
    }

    public void start(){
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }
    public void stop(){
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto has stopped");
    }
    public void accelerate(int kmPerHouse){
        currentSpeed += kmPerHouse;
        System.out.println("Accelerating. Current speed is " + currentSpeed + " kmPerHouse");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }
}

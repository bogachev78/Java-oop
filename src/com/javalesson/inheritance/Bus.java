package com.javalesson.inheritance;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Constructing bus");
    }

    public void fuelUp(){
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    public void setPassengerNumber(int passengerNumber){
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassenger(int passengerNum){
        this.passengerNumber += passengerNum;
        System.out.println("Picking up " + passengerNum + " passengers");
    }

    public void realesePassengers(){
        if(isRunning){
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passenger released");
    }
}

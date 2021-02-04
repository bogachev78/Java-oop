package com.javalesson.inheritance;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Constructing bus");
    }

    public void fuelUp(){
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if(volume > getTankVolume()){
            setAvailablePetrol(getTankVolume());
        }
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

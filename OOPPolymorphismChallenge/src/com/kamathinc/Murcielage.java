package com.kamathinc;

/**
 * Created by Ganesh on 24-02-2022.
 */
class Murcielage extends Car{
    public Murcielage(){
        super("Murcielage",13);
    }

    @Override
    public void startEngine() {
        System.out.println("Murcielage started");
    }

    @Override
    public void accelerate(int speed) {

        System.out.println("Murcielage accelerating by "+speed);
    }

    @Override
    public void brake() {
        System.out.println("Brakes applied for Murcielage");
    }
}

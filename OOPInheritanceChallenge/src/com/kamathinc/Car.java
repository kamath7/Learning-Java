package com.kamathinc;

/**
 * Created by Ganesh on 22-02-2022.
 */
public class Car extends Vehicle {
    private int doors;
    private int gears;
    private int wheels;
    private boolean isManual;

    private int currentGear;

    public Car(int size, int wheels, int doors, int gears, int wheels1, boolean isManual, int currentGear) {
        super("Car", size);
        this.doors = doors;
        this.gears = gears;
        wheels = wheels1;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car gear changed to "+this.currentGear);
    }

    public void changeVelocity (int speed, int direction){
        super.move(speed, direction);
        System.out.println("Car.changeVelocity() . Velocity "+speed+" Direction "+direction);
    }
}

package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
//Composition is has-a relationship. Modeling parts
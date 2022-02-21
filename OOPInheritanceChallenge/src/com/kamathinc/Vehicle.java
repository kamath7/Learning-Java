package com.kamathinc;

/**
 * Created by Ganesh on 22-02-2022.
 */
public class Vehicle {
    private String name;
    private int size;
    private int wheels;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int size, int wheels) {
        this.name = name;
        this.size = size;
        this.wheels = wheels;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction ){
        this.currentDirection += direction;
        System.out.println("Vehicle currently moving in the following direction -> "+currentDirection);
    }

    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle now moving at "+currentVelocity +" in direction "+currentDirection);
    }



}

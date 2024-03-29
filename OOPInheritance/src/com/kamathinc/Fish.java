package com.kamathinc;

/**
 * Created by Ganesh on 18-02-2022.
 */
public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){
        System.out.println("Fish.rest() called");
    }

    private void moveMuscles(){
        System.out.println("Fish.moveMuscles() called");
    }

    private void backPaddle(){
        System.out.println("Fish.backPaddle() called");
    }
    private void swim(int speed){
        moveMuscles();
        backPaddle();
        super.move(21);
    }

}

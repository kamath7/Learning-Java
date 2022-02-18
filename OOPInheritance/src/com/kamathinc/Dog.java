package com.kamathinc;

/**
 * Created by Ganesh on 18-02-2022.
 */
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //call the constructor of the class we are extending from. Super class here is Animal
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog chewing ...");
    }

    @Override
    public void eat() {
        super.eat();
        chew();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(20);//calls the method here since it exists. if it doesn't exist here, it goes to the super class
    }
    public void run(){
        System.out.println("Dog.run() called");
        super.move(25); //calls the move in the super class

    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called at "+speed);
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(20);
        super.move(speed);
    }
}
//Every single class created extends the Object class
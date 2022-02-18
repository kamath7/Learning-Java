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
}
//Every single class created extends the Object class
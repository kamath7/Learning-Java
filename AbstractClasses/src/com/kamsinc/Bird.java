package com.kamsinc;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eating!");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+" breathing!");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying!");
    }
}

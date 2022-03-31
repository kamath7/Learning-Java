package com.kamsinc;

public class Bird extends Animal{
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
}

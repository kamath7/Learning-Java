package com.kamsinc;

public class Dog extends Animal{
    public Dog() {
        super("Dog");
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

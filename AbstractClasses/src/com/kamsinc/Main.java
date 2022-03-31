package com.kamsinc;

public class Main {

    public static void main(String[] args) {

        //Can't instantiate Abstract class
        Dog dog = new Dog();
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Puka the Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin skipper = new Penguin("Skipper");
        skipper.breathe();
        skipper.eat();
        skipper.fly();
    }
}

package com.kamsinc;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe();
        dog.eat();

        Bird bird = new Bird("Ostrich");
        bird.breathe();
        bird.eat();
    }
}

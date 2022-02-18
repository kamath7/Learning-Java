package com.kamathinc;

/**
 * Created by Ganesh on 18-02-2022.
 */
public class Dog extends Animal{

    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight); //call the constructor of the class we are extending from. Super class here is Animal
    }
}

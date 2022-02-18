package com.kamathinc;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Spider",1,1,23,5);
        System.out.println(animal.getName());


        Dog dog = new Dog("Lemi",15,22,2,4,1,32,"White fur");
        System.out.println(dog.getName()+" has "+dog.getBrain());
        dog.eat();
    }
}

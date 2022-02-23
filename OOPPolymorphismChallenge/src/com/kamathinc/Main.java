package com.kamathinc;


class Car{

    private String name;
    private String engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = "V8 Turbomax";
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("Ranodm car started");
    }

    public void accelerate(int speed){
        System.out.println(" Random car accelerated by "+speed);
    }
    public void brake(){
        System.out.println("Random car brakes applied");
    }

}

class Ambassador extends Car{
    public Ambassador(){
        super("Ambassador",3);
    }

    @Override
    public void startEngine() {
        System.out.println("Ambassador started");
    }

    @Override
    public void accelerate(int speed) {

        System.out.println("Ambassador accelerating by "+speed);
    }

    @Override
    public void brake() {
        System.out.println("Brakes applied for Ambassador");
    }
}
class Padmini extends Car{}
class Murcielage extends Car{}


public class Main {



    public static void main(String[] args) {
	// write your code here

    }
}

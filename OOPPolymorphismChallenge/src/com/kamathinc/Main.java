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
class Padmini extends Car{
    public Padmini(){
        super("Padmini",2);
    }

    @Override
    public void startEngine() {
        System.out.println("Padmini started");
    }

    @Override
    public void accelerate(int speed) {

        System.out.println("Padmini accelerating by "+speed);
    }

    @Override
    public void brake() {
        System.out.println("Brakes applied for Padmini");
    }
}
class Murcielage extends Car{
    public Murcielage(){
        super("Murcielage",13);
    }

    @Override
    public void startEngine() {
        System.out.println("Murcielage started");
    }

    @Override
    public void accelerate(int speed) {

        System.out.println("Murcielage accelerating by "+speed);
    }

    @Override
    public void brake() {
        System.out.println("Brakes applied for Murcielage");
    }
}


public class Main {


    public static void main(String[] args) {
	// write your code here

        Car car = new Car("Lalle Car",5);
        car.startEngine();
        car.accelerate(10);
        car.brake();

        for (int i = 1 ; i <= 10 ; i ++){
            Car myCar = giveMeARandomCar();
            System.out.println("Car #"+i+" is "+myCar.getName()+"\n");
            myCar.startEngine();
            myCar.accelerate(10);
            myCar.brake();
            System.out.println("\n");
        }

    }

    public static Car giveMeARandomCar(){
        int randomNum = (int) (Math.random() * 3 ) +1;
        switch(randomNum){
            case 1: return new Ambassador();
            case 2: return new Padmini();
            case 3: return new Murcielage();
        }
        return null;
    }
}

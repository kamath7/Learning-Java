package com.kamsinc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gearbox ferrari = new Gearbox(7);

        ferrari.operateClutch(true);
        ferrari.changeGear(1);
        ferrari.operateClutch(false);
        System.out.println(ferrari.changeWheelSpeed(900));
        ferrari.changeGear(2);
        System.out.println(ferrari.changeWheelSpeed(1000));
        ferrari.changeGear(3);
//        Gearbox.Gear first = ferrari.new Gear(1,12.3);
//        Gearbox.Gear second = ferrari.new Gear(2, 23.4);
//        Gearbox.Gear third = ferrari.new Gear(3, 27.2);
//
//        System.out.println(first.driveSpeed(1000));
//        System.out.println(second.driveSpeed(900));
//        System.out.println(third.driveSpeed(280));
    }
}
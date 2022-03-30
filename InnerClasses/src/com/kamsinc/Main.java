package com.kamsinc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gearbox ferrari = new Gearbox(7);
        Gearbox.Gear first = ferrari.new Gear(1,12.3);

        System.out.println(first.driveSpeed(1000));
    }
}

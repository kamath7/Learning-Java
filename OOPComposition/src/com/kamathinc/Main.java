package com.kamathinc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Case myCase = new Case("GG Model","Logitech",260, new Dimensions(12,14,15));
        Monitor monitor = new Monitor("22 inch good one","Dell",1080, new Resolution(1600, 900));
        Motherboard motherboard = new Motherboard("PowerHouse xx","Gigabyte",4,16,"SomeGoodBios");

        PC myPc = new PC(myCase, motherboard, monitor);

        myPc.getMonitor().drawCursorAt(2,3);
        myPc.getMotherboard().loadProgram("Java9");
        


    }
}

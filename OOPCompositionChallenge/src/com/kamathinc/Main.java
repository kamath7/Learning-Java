package com.kamathinc;

public class Main {

    public static void main(String[] args) {
	// write your code

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, "Brown");

        Bed bed = new Bed("King",2,12,2);
        Lights lights = new Lights("cool lamp",12,false);

        Bedroom bedroom = new Bedroom(wall1,wall2,wall3,ceiling,bed,lights);

        bedroom.arrangeBed();
        bedroom.getLights();
    }
}

package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class Bedroom {
    private Wall wall1, wall3, wall2;
    private Ceiling ceeling;
    private Bed bed;
    private Lights lights;

    public Bedroom(Wall wall1, Wall wall3, Wall wall2, Ceiling ceeling, Bed bed, Lights lights) {
        this.wall1 = wall1;
        this.wall3 = wall3;
        this.wall2 = wall2;
        this.ceeling = ceeling;
        this.bed = bed;
        this.lights = lights;
    }

    public void getLights() {
        lights.turnOn();
    }

    public void arrangeBed(){
        System.out.println("Arranging Bed ,,,, ");
        bed.make();
    }
}

package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class PC {

    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;


    public PC(Case pcCase, Motherboard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void powerUp(){
        pcCase.pressPowerBtn();
        drawRandomly();
    }
    public void drawRandomly(){
        monitor.drawCursorAt(12,34);

    }
    public void loadPrograms(){
        motherboard.loadProgram("Java11");
    }

}

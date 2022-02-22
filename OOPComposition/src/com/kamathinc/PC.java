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

    public Case getPcCase() {
        return pcCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}

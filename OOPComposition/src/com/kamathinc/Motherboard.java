package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class Motherboard {

    private String modelName;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String modelName, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void loadProgram(String programName){
        System.out.println(programName+" is now loaded");
    }
}

package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class Case {
    private String model;
    private String manufacturer;
    private int powerSupplyWattage;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, int powerSupplyWattage, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupplyWattage = powerSupplyWattage;
        this.dimensions = dimensions;
    }

    public void pressPowerBtn(){
        System.out.println("Power button pressed");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPowerSupplyWattage() {
        return powerSupplyWattage;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

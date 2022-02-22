package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class Monitor {
    private String model;
    private String manufacturer;
    private int display;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int display, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.display = display;
        this.nativeResolution = nativeResolution;
    }

    public void drawCursorAt(int x, int y){
        System.out.println("Cursor moved to  "+x+" "+y);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getDisplay() {
        return display;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}

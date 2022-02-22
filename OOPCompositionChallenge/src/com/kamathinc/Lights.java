package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class Lights {
    private String style;
    private int height;
    private boolean batteryOperated;

    public Lights(String style, int height, boolean batteryOperated) {
        this.style = style;
        this.height = height;
        this.batteryOperated = batteryOperated;
    }

    public  void turnOn(){
        System.out.println("turning on lights - call from Lights class");
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public boolean isBatteryOperated() {
        return batteryOperated;
    }
}

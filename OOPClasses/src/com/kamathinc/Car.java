package com.kamathinc;

/**
 * Created by Ganesh on 17-02-2022.
 */
public class Car {
    private int wheels;
    private int doors;
    private String engine;
    private String color;
    private String model;

    public void setModel(String model){
        String isValid = model.toLowerCase();
        if (isValid.equals("Awesome")){
            this.model = model;
        }
        this.model = "Undefined";
    }
    public String getModel(){
        return this.model;
    }
}

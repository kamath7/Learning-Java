package com.kamathinc;

/**
 * Created by Ganesh on 28-02-2022.
 */
public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadType;

    private String additionName1;
    private double additionAmount1;

    private String additionName2;
    private double additionAmount2;

    private String additionName3;
    private double additionAmount3;

    private String additionName4;
    private double additionAmount4;

    public Hamburger(String name, String meat, double price, String breadType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadType = breadType;
    }

    public void addHamburderAddition1(String name, double price){
        this.additionName1 = name;
        this.additionAmount1 = price;
    }

    public void addHamburderAddition2(String name, double price){
        this.additionName2 = name;
        this.additionAmount2 = price;
    }

    public void addHamburderAddition3(String name, double price){
        this.additionName3 = name;
        this.additionAmount3 = price;
    }

    public void addHamburderAddition4(String name, double price){
        this.additionName4 = name;
        this.additionAmount4 = price;
    }
}

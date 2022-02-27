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
}

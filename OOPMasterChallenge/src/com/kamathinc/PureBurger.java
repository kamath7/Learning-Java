package com.kamathinc;

/**
 * Created by Ganesh on 28-02-2022.
 */
public class PureBurger extends Hamburger {

    private String healthyAdditionName1;
    private double healthyAdditionAmount1;

    private String healthyAdditionName2;
    private double healthyAdditionAmount2;

    public PureBurger( String meat, double price) {
        super("Overpriced Burger", meat, price, "Brown Rye Bread");
    }

    public void addHealthAddition1(String name, double price){
        this.healthyAdditionName1 = name;
        this.healthyAdditionAmount1 = price;
    }
    public void addHealthAddition2(String name, double price){
        this.healthyAdditionName2 = name;
        this.healthyAdditionAmount2 = price;
    }
}

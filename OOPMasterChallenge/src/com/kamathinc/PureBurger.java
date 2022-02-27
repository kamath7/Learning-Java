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

    @Override
    public double totalValue() {

        double burgerPrice = super.totalValue();

        if (this.healthyAdditionName1 !=null){
            burgerPrice += healthyAdditionAmount1;
            System.out.println("The following addition is added "+healthyAdditionName1+". Cost now stands at "+burgerPrice);

        }

        if (this.healthyAdditionName2 !=null){
            burgerPrice += healthyAdditionAmount2;
            System.out.println("The following addition is added "+this.healthyAdditionName2+". Cost now stands at "+burgerPrice);

        }

        return burgerPrice;
    }
}

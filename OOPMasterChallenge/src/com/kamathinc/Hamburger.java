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

    public double totalValue(){
        double burgerPrice = this.price;
        System.out.println(this.name+" burger using "+ this.breadType+ " with the "+this.meat+" costs "+this.price);

        if (this.additionName1 != null){
            burgerPrice += this.additionAmount1;
            System.out.println("The following addition is added "+this.additionName1+". Cost now stands at "+burgerPrice);
        }

        if (this.additionName2 != null){
            burgerPrice += this.additionAmount2;
            System.out.println("The following addition is added "+this.additionName2+". Cost now stands at "+burgerPrice);
        }

        if (this.additionName3 != null){
            burgerPrice += this.additionAmount3;
            System.out.println("The following addition is added "+this.additionName3+". Cost now stands at "+burgerPrice);
        }

        if (this.additionName4 != null){
            burgerPrice += this.additionAmount4;
            System.out.println("The following addition is added "+this.additionName4+". Cost now stands at "+burgerPrice);
        }
        return burgerPrice;
    }
}

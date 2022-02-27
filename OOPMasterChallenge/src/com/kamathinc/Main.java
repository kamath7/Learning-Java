package com.kamathinc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("McFish","Fish", 5.60, "Wheat bread");
        System.out.println(hamburger.totalValue());

        hamburger.addHamburderAddition1("Pickles",0.90);
        hamburger.addHamburderAddition2("kethcup",0.60);

        System.out.println(hamburger.totalValue());

        PureBurger pureBurger = new PureBurger("Veg Patty", 8.90);
        System.out.println(pureBurger.totalValue());
        pureBurger.addHealthAddition1("Tofu",9.00);
        System.out.println(pureBurger.totalValue());


        SuperBurger superBurger = new SuperBurger();
        superBurger.totalValue();
        superBurger.addHamburderAddition1("Chips more",9.00);
    }
}

package com.kamathinc;

/**
 * Created by Ganesh on 28-02-2022.
 */
public class SuperBurger extends Hamburger {

    public SuperBurger() {
        super("Super Deluxe Meal", "McFish with Hollandaise Sauce", 15.60, "Regular white bread");
        super.addHamburderAddition1("Fries",6.78);
        super.addHamburderAddition2("Coke",2.89);
    }

    @Override
    public void addHamburderAddition1(String name, double price) {
        System.out.println("Additional items disallowed");
    }

    @Override
    public void addHamburderAddition2(String name, double price) {
        System.out.println("Additional items disallowed");
    }

    @Override
    public void addHamburderAddition3(String name, double price) {
        System.out.println("Additional items disallowed");
    }

    @Override
    public void addHamburderAddition4(String name, double price) {
        System.out.println("Additional items disallowed");
    }
}

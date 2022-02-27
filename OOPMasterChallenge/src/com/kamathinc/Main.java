package com.kamathinc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("McFish","Fish", 5.60, "Wheat bread");
        System.out.println(hamburger.totalValue());

        hamburger.addHamburderAddition1("Pickles",0.90);
        hamburger.addHamburderAddition2("kethcup",0.60);

        System.out.println(hamburger.totalValue());
    }
}

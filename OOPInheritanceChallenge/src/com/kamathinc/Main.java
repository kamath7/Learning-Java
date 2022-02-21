package com.kamathinc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Ambassador ambassador = new Ambassador(24);

        ambassador.accelatate(30);
        ambassador.steer(30);
        ambassador.getCurrentDirection();
        ambassador.stop();
    }
}

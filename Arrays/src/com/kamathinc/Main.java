package com.kamathinc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] myArray = new int[10];
        myArray[2] = 69;
        System.out.println(myArray[2]);

        double[] anotheArray = new double[10];
        anotheArray[3] = 60;
        System.out.println(anotheArray[3]);

        int[] shortCutArray = {10,20,30};
        System.out.println(shortCutArray[2]);
    }
}

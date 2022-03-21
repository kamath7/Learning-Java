package com.kamsinc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Primitive types - value type
            //Array & String - reference types

        int someVal = 10;
        int someOtherVal = someVal;

        System.out.println("Value1 -> "+someVal);
        System.out.println("Value2 -> "+someOtherVal);

        someVal++;

        System.out.println("Value1 -> "+someVal);
        System.out.println("Value2 -> "+someOtherVal);
    }
}

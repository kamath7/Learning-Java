package com.kamsinc;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] someStrings = new String[10];
        ArrayList<String> myArrList = new ArrayList<>();

        myArrList.add("Hello");

        //Can't do this -
//        ArrayList<int> myInts = new ArrayList<int>();

        //String is a class not a primitive type

        // can use an object wrapper

//        Integer integer= new Integer(54);

        ArrayList<Integer> myIntList = new ArrayList<>();
        for (int i = 0 ; i <= 10 ; i++){
            //Autoboxing
            myIntList.add(Integer.valueOf(i) * 2);
        }

        //Unboxing
        for(int i = 0 ; i <=10 ; i++){
            System.out.println(myIntList.get(i).intValue());
            //removing the primitive value from boxed object wrapper
        }
        System.out.println(myIntList);

    }
}

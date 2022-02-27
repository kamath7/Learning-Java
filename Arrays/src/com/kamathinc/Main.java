package com.kamathinc;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


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

        int[] coolArray = new int[10];

        for(int i = 0 ; i < coolArray.length; i++){
            coolArray[i] = i * 69;
        }

        for (int i = 0 ; i<coolArray.length ; i++){
            System.out.println(coolArray[i]);
        }

        printMyArray(coolArray);

        int[] someMoreNums = getNum(11);
        printMyArray(someMoreNums);
        System.out.println("average of the array is "+getAvg(someMoreNums));

    }

    public static int[] getNum(int number){
        System.out.println("Enter "+number+" values");

        int [] values = new int[number];

        for (int i = 0 ; i < values.length ; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printMyArray(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(i+" -> "+arr[i]);
        }
    }

    public static float getAvg (int[] arr){
        int sum = 0;

        for(int i = 0 ; i < arr.length; i ++){
            sum += arr[i];
        }
        return sum/(arr.length);
    }
}

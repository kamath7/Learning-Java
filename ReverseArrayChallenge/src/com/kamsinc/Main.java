package com.kamsinc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int count = scanner.nextInt();
        int []arr = new int[count];
        System.out.println("Enter your array");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Reversing...");
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray (int [] arr){
        int maxInd = arr.length -1;
        int halfInd = arr.length/2;

        for(int i = 0 ; i<halfInd; i++){
            int temp = arr[i];
            arr[i]= arr[maxInd -i];
            arr[maxInd-i] = temp;
        }
    }
}

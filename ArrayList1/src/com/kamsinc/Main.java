package com.kamsinc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code hereint
        int[] myArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //resizing
        int[] originalArr = myArr;
        System.out.println("Original Arr ->" + Arrays.toString(myArr));
        myArr = new int[12];
        for(int i = 0 ; i < originalArr.length; i++){
            myArr[i] = originalArr[i];
        }
        System.out.println("Resized Arr ->" + Arrays.toString(myArr));
    }
}

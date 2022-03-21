package com.kamsinc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
   static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the count of integers");
        int count = scanner.nextInt();
        int[] myArr = readInteger(count);
        System.out.println("Min element in the array is "+returnMin(myArr));
    }

    private static int[] readInteger(int count){
        int[] myArr = new int[count];
        System.out.println("Enter "+count+" integers");
        for(int i = 0 ; i < myArr.length ; i ++){
            System.out.println("Enter value for position "+i);
            myArr[i] = scanner.nextInt();
        }
        return myArr;
    }
    private static int returnMin(int[] arr){
        sortNumbers(arr);
        return arr[0];
    }

    private static int[] sortNumbers(int[] arr){
        int[] mySortedArr = arr;
        Arrays.sort(mySortedArr);
        return mySortedArr;
    }
}

package com.kamathinc;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        int[] myArr = getIntegers(6);
        printArray(myArr);
        System.out.println("-----------");
        printArray(sortMe(myArr));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " values");

        int[] myArr = new int[number];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = scanner.nextInt();
        }

        return myArr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " -> " + arr[i]);
        }
    }

    public static int[] sortMe(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }
}

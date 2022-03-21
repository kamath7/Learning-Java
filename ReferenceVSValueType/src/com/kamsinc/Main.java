package com.kamsinc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Primitive types - value type
            //Array & String - reference types

        int someVal = 10;
        int someOtherVal = someVal;

        System.out.println("Value1 -> "+someVal);//10
        System.out.println("Value2 -> "+someOtherVal);//10

        someVal++;

        System.out.println("Value1 -> "+someVal);//11
        System.out.println("Value2 -> "+someOtherVal);//10

        int []someIntArr = new int[5];
        int []someOtherIntArr = someIntArr; //referring to the same object. Kind of like bruce wayne's house points to batman and bruce wayne

        System.out.println("Array1 -> "+ Arrays.toString(someIntArr));
        System.out.println("Array2 -> "+ Arrays.toString(someOtherIntArr));

        someIntArr[0] = 69;

        System.out.println("Array1 -> "+ Arrays.toString(someIntArr));
        System.out.println("Array2 -> "+ Arrays.toString(someOtherIntArr));

        changeMyArr(someIntArr);//3 references - arr1, arr2, and the parameter

        System.out.println("Array1 -> "+ Arrays.toString(someIntArr));
        System.out.println("Array2 -> "+ Arrays.toString(someOtherIntArr));

        someOtherIntArr = new int[]{4,5,6,7,8};
        changeMyArr(someIntArr);
        System.out.println("Array1 -> "+ Arrays.toString(someIntArr));
        System.out.println("Array2 -> "+ Arrays.toString(someOtherIntArr));
    }

    private static void changeMyArr(int[] arr){
        arr[0] = 2;

    }
}

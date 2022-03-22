package com.kamsinc;

import java.util.Arrays;

public class ResizingArr {
    public static void  main(String[] args){
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

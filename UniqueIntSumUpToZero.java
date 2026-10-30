package com.Leetcode;

import java.util.Arrays;

public class UniqueIntSumUpToZero {
    static void main(String[] args) {
        int []arr = new int[5];
        int count =  1;

        while (count!=0){
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                int n = (int) (Math.random()*19) - (9);
                arr[i] = n;
                count = count+n;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

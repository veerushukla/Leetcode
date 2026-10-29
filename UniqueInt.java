package com.Leetcode;

import java.util.Arrays;

public class UniqueInt {
    static void main(String[] args) {
        int []arr = new int[3];
        int count = 0;
        int tar = arr.length;
        while(count!=tar){
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                int n = (int) (Math.random()*19) - (9);
                arr[i] = n;
                count = count + n;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}

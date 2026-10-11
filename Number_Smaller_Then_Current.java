package com.Leetcode;

import java.util.Arrays;

public class Number_Smaller_Then_Current {
    static void main(String[] args) {
        int []arr = {8,1,2,2,3};
        int []count = new int[arr.length];
        int n = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    count[i] = n+1;
                    n = n+1;
                }
            }
            n=0;
        }
        System.out.println(Arrays.toString(count));
    }
}

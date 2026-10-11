package com.Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Greatest_No_of_Candies {
    static void main(String[] args) {
        int []candy = {4,2,1,1,2};
        //find max of it
        int max = 0;
        for (int i = 0; i < candy.length; i++) {
            if(max<candy[i]){
                max = candy[i];
            }
        }
        System.out.println(max);
        // now add extra candy to all candy
        int extra = 1;
        for (int i = 0; i < candy.length; i++) {
            candy[i] = candy[i]+extra;
        }
        //compare all candies to max

        Boolean []arr = new Boolean[candy.length];
        for (int i = 0; i < candy.length; i++) {
            if(max>candy[i]){
                arr[i] = false;
            }else {
                arr[i] = true;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

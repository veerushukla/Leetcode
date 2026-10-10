package com.Leetcode;

import java.util.Arrays;

public class Running_sum_of_array {
    static void main(String[] args) {
        int []arr = {1,3,4,5};
        int []res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                res[0] = arr[0];
            }else {
                res[i] = arr[i]+res[i-1];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}

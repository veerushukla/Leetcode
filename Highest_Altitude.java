package com.Leetcode;

import java.util.Arrays;

public class Highest_Altitude {
    static void main(String[] args) {
        int []arr = {-4,-3,-2,-1,4,3,2};
        int []out = new int[arr.length+1];
        int add = 0;
        out[0] = add;

        for (int i = 0; i < arr.length; i++) {
            out[i+1] = add+arr[i];
            add = add+arr[i];
        }

        System.out.println(Arrays.toString(out));

        int alt = out[0];
        for (int i = 0; i < out.length; i++) {
            if(alt<out[i]){
                alt = out[i];
            }
        }

        System.out.println(alt);

    }
}

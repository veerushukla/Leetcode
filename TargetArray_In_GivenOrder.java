package com.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray_In_GivenOrder {
    static void main(String[] args) {
        int []arr = {0,1,2,3,4};
        int []index = {0,1,2,2,1};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(index[i],arr[i]);

        }
        System.out.println(list);
        int []out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = list.get(i);
        }
        
    }
}

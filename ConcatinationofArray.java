package com.Leetcode;
import  java.util.Arrays;

public class ConcatinationofArray {
    static void main(String[] args) {
        int []arr = {1,3,2,1};
        int []out = new int[arr.length*2];

        for (int i = 0; i < out.length; i++) {
            out[i]=arr[i% arr.length];
        }

        System.out.println(Arrays.toString(out));
    }
}

// here out[i] = [i % arr.length] => arr[]  == assign values
//          0  =  0 % 4           => arr[0] == 1
//          1  =  1 % 4           => arr[1] == 3
//          2  =  2 % 4           => arr[2] == 2
//          3  =  3 % 4           => arr[3] == 1
//          4  =  4 % 4           => arr[0] == 1
//          5  =  5 % 4           => arr[1] == 3
//          6  =  6 % 4           => arr[2] == 2
//          7  =  7 % 4           => arr[3] == 1
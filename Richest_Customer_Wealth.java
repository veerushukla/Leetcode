package com.Leetcode;

import java.util.Arrays;

public class Richest_Customer_Wealth {
    static void main(String[] args) {
        int [][]arr = {{1,2,3},
                        {3,4,1},
                        {1,9,4}};
        int []temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                        temp[i] = temp[i] + arr[i][j];
            }
        }
        int max =0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]>max){
                max = temp[i];
            }
        }
        System.out.println(max);
    }
}

package com.Leetcode;
import  java.util.Arrays;

public class Remove_Element {
    static void remove(int []arr, int tar){
        int []sort = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==tar){
                arr[i]=0;
            }
            sort[i]=arr[i];
        }
        System.out.println(Arrays.toString(sort));

    }
    static void main(String[] args) {
        int []arr = {1,2,4,5};
        int tar = 2;
        remove(arr, tar);
    }
}

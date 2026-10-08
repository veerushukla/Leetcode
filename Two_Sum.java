package com.Leetcode;

public class Two_Sum {
    static void main(String[] args) {
        int arr[] = {8,7,2,15};
        int tar = 9;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == tar){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}

package com.Leetcode;

public class Two_Sum {

    static int[] sum(int []arr, int tar){
        int []arr1 = new int[2];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == tar){
                    System.out.println(i + " " + j);
                    arr1[0] = i;
                    arr1[1] = j;
                    return arr1;
                }
            }
        }
        return arr1;
    }

    static void main(String[] args) {
        int []arr = {8,2,15,7};
        int tar = 9;
        int[] result = sum(arr, tar);

    }
}

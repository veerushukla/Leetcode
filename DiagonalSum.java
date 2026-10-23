package com.Leetcode;

public class DiagonalSum {
    static void main(String[] args) {
        int [][]arr = {{1,1,1},{2,2,2},{3,3,3}};
        int count = 0;
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= arr[i-1].length; j++) {
                if(i==j || i+j== arr.length+1){
                    count = count + arr[i-1][j-1];
                }
            }
        }
        System.out.println(count);
    }
}

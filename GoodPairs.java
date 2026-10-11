package com.Leetcode;

public class GoodPairs {
    static void main(String[] args) {
        // A good pair is
        //Example => A = [1,2,3,1,1,3]
        // a good pair (i,j) (0,3)(0,4)(3,4)(2,5) element at index 0 = element at index 3 and index i<j;

        int []arr = {1,2,3,1,1,3};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j] & i<j){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

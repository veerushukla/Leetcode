package com.Leetcode;
import java.util.Arrays;

public class Shuffle_Array {
    static void main(String[] args) {
        int []arr = {2,5,1,3,4,7};
        int n =3;
        int []before_n = new int[n];
        int b = 0;
        int []after_n = new int[n];
        int a = 0;

        int []out = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(i<n){
                before_n[b++] = arr[i];
            }else {
                after_n[a++] = arr[i];
            }
        }
        int k = 0;
        for (int i = 0; i < 3; i++) {
            out[k] = before_n[i];
            k++;
            out[k] = after_n[i];
            k++;
        }

        System.out.println(Arrays.toString(before_n));
        System.out.println(Arrays.toString(after_n));



        System.out.println(Arrays.toString(out));
    }
}

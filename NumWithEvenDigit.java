package com.Leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumWithEvenDigit {
    static void main(String[] args) {
        int []arr = {437,315,322,433,686,264,442};
        int count = 0;
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            while(arr[i] != 0){
                int rem =  arr[i]%10;
                num.add(rem);
                arr[i] = arr[i]/10;
            }
            if(num.size()%2 == 0){
                count++;
            }
            num.clear();
        }
        System.out.println(count);

    }
}

package com.Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueIntSumUpToZero2 {
    static void main(String[] args) {
        int []arr = new int[7];

        //aproch1-----------------------------------------------------------
//        int inital1 = 0;
//        int inital2 = 0;

//        if((arr.length%2) == 0){
//            for (int i = 0; i < arr.length; i++) {
//                if(i>=(arr.length/2)){
//                    arr[i] = inital1+1;
//                    inital1 = arr[i];
//                }else {
//                    arr[i] = -((arr.length)/2)+inital2;
//                    inital2++;
//                }
//            }
//        } else {
//            for (int i = 0; i < arr.length; i++) {
//                if(i>=(arr.length/2)){
//                    arr[i] = inital1;
//                    inital1++;
//                }else {
//                    arr[i] = -((arr.length)/2)  +inital2;
//                    inital2++;
//                }
//            }
//        }

//        approch2--------------------------------------------------------

        int len = arr.length;
        int start = -(len)/2;

        for (int i = 0; i < len; i++) {
            arr[i] = start+i;

            if(len%2 == 0 && arr[i] >= 0 ){
                arr[i]++;
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}

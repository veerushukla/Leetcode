package com.Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckyNum {
    static void main(String[] args) {
        int [][]arr = {{1,10,4,2},
                       {9,3,8,7},
                       {15,16,17,12}};


        //lucky num is an element of the matrix such that it is the minimum element in its row and maximum in its column.

        List<Integer> list1 = new ArrayList<>();

        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            int min = arr[i][0];
            for (int j = 1; j < col; j++) {
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
            list1.add(min);
        }

        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i <col; i++) {
            int max = arr[0][i];
            for (int j = 1; j < row; j++) {
                if(max<arr[j][i]){
                    max = arr[j][i];
                }
            }
            list2.add(max);
        }
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            int m = list1.get(i);
            for (int j = 0; j < list2.size(); j++) {
                if(m==list2.get(j)){
                    list3.add(m);
                }
            }
        }

        System.out.println(list3);
    }
}

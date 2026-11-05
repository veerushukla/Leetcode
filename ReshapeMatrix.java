package com.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReshapeMatrix {
    static void main(String[] args) {
        int [][]arr1 = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 2;

        if(r*c== (arr1.length*arr1[0].length)){
            int [][]arr2 = new int[r][c];

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    list.add(arr1[i][j]);
                }
            }

            System.out.println(list);

            int m = 0;
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    arr2[i][j] = list.get(m);
                    m++;
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
        else {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    System.out.print(arr1[i][j]+ " ");
                }
                System.out.println(" ");
            }
        }
    }
}

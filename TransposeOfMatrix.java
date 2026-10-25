package com.Leetcode;

import java.util.ArrayList;

public class TransposeOfMatrix {

    static void main(String[] args) {
        int[][] matrix = {{1, 2},
                          {3, 4}};

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] out = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                out[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i].length; j++) {
                System.out.print(out[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }
}

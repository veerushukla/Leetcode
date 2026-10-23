package com.Leetcode;

public class Flipping_Image {
    static void main(String[] args) {
        int [][]image = {{1,1,0,1},{1,0,1,0},{1,1,0,1},{1,0,1,1}};

        for (int i = 0; i < image.length; i++) {
            int n = Math.floorDiv(image.length, 2);
            int temp = 0;
            for (int j = 0; j < n; j++) {
                temp = image[i][j];
                image[i][j] = image[i][image.length -  j - 1];
                image[i][image.length -  j - 1] = temp;
            }
        }

        //reverse
        System.out.println("the reversed array");
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println(" ");
        }

        //flipped one
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }else {
                    image[i][j] = 0;
                }
            }
        }

        //after flipping
        System.out.println("Flipped");
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println(" ");
        }

    }
}
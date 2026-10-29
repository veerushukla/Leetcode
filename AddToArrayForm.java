package com.Leetcode;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.Collection;

public class AddToArrayForm {
    static void main(String[] args) {
        int []arr = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;

        int p = arr.length-1; // pointer p pointing array last element;
        int carry = 0;
        List<Integer> list = new ArrayList<>();
        while(p>=0 || k>0){
            int numval = 0;
            if(p>=0){
                numval = arr[p];
            }
            int rem = k%10;
            int sum = numval+rem + carry;
            int digit = sum%10;
            carry = sum/10;
            list.add(digit);
            k = k/10;
            p--;
        }
        if(carry>0){
            list.add(carry);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}

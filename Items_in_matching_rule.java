package com.Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Items_in_matching_rule {
    static void main(String[] args) {

//        String []rule_key = {"type", "color", "name"};
//        String [][]rule_value = {{"phone","blue","pixel"},
//                                 {"computer","silver","lenovo"},
//                                 {"phone","gold","iphone"}};
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("key");
//        String key = sc.nextLine();
//        System.out.println("value");
//        String value = sc.nextLine();
//
//        int i = 0;
//        int j = 0;
//        int count = 0;
//
//        while(i<rule_key.length){
//            if(rule_key[i].equals(key)){
//                while(j< rule_value.length){
//                    if(rule_value[j][i].equals(value)){
//                        count++;
//                    }
//                    j++;
//                }
//            }
//            i++;
//        }
//
//        System.out.println(count);


//        ----------------------------------------------------------------------------------------------------------------------


        // list method

        List<String> rule_key = List.of("type", "color", "name");
        List<List<String>> rule_value = List.of(
                List.of("phone","blue","pixel"),
                List.of("computer","silver","lenovo"),
                List.of("phone","gold","iphone")
        );

        Scanner sc = new Scanner(System.in);
        System.out.println("key");
        String key = sc.nextLine();
        System.out.println("value");
        String value = sc.nextLine();

        int i = 0;
        int j = 0;
        int count = 0;

        while (i< rule_key.size()){
            if(rule_key.get(i).equals(key)){
                while(j< rule_value.size()){
                    if(rule_value.get(j).get(i).equals(value)){
                      count++;
                    }
                    j++;
                }
            }
            i++;
        }

        System.out.println(count);

    }
}

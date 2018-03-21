package com.example.stockmarketCSVtemplate.practiceAlgos;

import java.util.HashMap;
import java.util.*;

class Pattern {
    public static void main(String[] args) {

        int[] arr = new int[]{-1, 5, 3, 4, 2, -6, 5, 3, 8};




        String strA = "LaunchCode";

        String[] strB = strA.split("");

        //System.out.println(strB);


        String vowels = "aeiou";

        String oddIndexStr = "";

        String stringDeleted = "";

        //System.out.println(min(arr));

        String front3 = strA.substring(0, 3);
        String back2 = strA.substring(strA.length() - 2);
        String target = front3 + back2;
        System.out.println(target);

    }
        public static int search(int[] nums, int target){

        for (int i = 0; i <nums.length; i++){

            if (nums[i]== target){
                return i;
            }
        }
        return -1;
        }







}
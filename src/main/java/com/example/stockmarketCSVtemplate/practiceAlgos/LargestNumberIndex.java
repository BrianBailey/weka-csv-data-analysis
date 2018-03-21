package com.example.stockmarketCSVtemplate.practiceAlgos;

public class LargestNumberIndex {

    public static void main(String[] args){

        int [] arr = new int[] {-1, 5, 6,8,2,5,3};

        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++ ){

            if (max < arr[i]){
                max = arr[i];
                index = i;
            }

        }

        System.out.println("Index position and the max int is: " + index + " "+ max);

    }




}
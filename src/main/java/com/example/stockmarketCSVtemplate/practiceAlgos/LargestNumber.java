package com.example.stockmarketCSVtemplate.practiceAlgos;

public class LargestNumber {

    public static void main(String[] args){

        int[] arr = new int[] {-1,20,30,50,4,71,100};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++){

            if (max < arr[i]){

                max = arr[i];
            }
        }

        System.out.println("The Given Array Element is:");
        for (int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }
        System.out.println("From the Array Element Largest is: "+ max);

    }


}

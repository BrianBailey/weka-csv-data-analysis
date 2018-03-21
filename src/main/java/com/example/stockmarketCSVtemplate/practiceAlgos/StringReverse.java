package com.example.stockmarketCSVtemplate.practiceAlgos;

import java.util.Arrays;

public class StringReverse {

    public static void main(String[] args){

        String string ="Welcome to Java Programming and Dotnet Programming";

        String[] wordsCount = string.split(" ");

        System.out.println("The Given String is:\n" + string + "\n");

        System.out.println(Arrays.toString(wordsCount));

        System.out.println("After Reverse String is:");


        for (int i =wordsCount.length; i > 0; i--){

            System.out.print(wordsCount[i -1] + " ");
        }

    }

}

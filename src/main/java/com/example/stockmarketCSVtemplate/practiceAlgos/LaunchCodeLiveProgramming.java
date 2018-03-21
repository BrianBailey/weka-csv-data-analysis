package com.example.stockmarketCSVtemplate.practiceAlgos;

import java.util.Scanner;

public class LaunchCodeLiveProgramming {

    public static void main(String args[]) {



        fizzBuzz(100);
    }

    public static void fizzBuzz(int x) {

        //Scanner

        // % 3   "fizz"

        // % 5   "buzz"

        // 3 and 5 fizzbuzz


        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number less than 1501");

        x = in.nextInt();

        for (int i = 1; i < x; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");

            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }

        }

    }



}
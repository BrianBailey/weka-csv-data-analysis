package com.example.stockmarketCSVtemplate.sololearnpractice;

import java.util.Scanner;

public class PracticeAlgos {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter in two integers to add: ");

        int x = sc.nextInt();

        int y = sc.nextInt();

        AddTwoInts target = new AddTwoInts();



        System.out.println("The sum is " +target.addTwoInts(x,y));
    }
}

package com.example.stockmarketCSVtemplate.neuralnetworks;

class BitwiseXOR {
    public static void main(String args[]){

        int num1 = 42;
        int num2 = 15;

        int x = 42;

        int y = 15;

        System.out.println(Integer.toBinaryString(x));
        System.out.println();
        System.out.println(Integer.toBinaryString(y));



        System.out.println("XOR Result =" +(num1 ^ num2));

    }
}
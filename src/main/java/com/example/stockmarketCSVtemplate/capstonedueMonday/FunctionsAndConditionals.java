package com.example.stockmarketCSVtemplate.capstonedueMonday;

public class FunctionsAndConditionals {

    public static void main(String[] args){
        System.out.println(start());


    }

    public static int func2(int w) {
        return w * 3;
    }

    public static int func1 (int a, int b) {
        int n = a + b;
        return 2 + func2(n);
    }

    public static int start() {
        int z = 4;
        return func1(z, 1) - 3;
    }


}

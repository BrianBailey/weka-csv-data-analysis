package com.example.stockmarketCSVtemplate.CodingBat;

import java.util.HashMap;
import java.util.Map;

public class JavaMap {

    public static void main(String[] args){

        String str = "cat";
        System.out.println(backAround(str));


    }

    public static String backAround(String str){

        char last = str.charAt(str.length()-1);

        return last+ str+ last;

    }
}

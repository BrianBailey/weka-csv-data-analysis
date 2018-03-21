package com.example.stockmarketCSVtemplate.practiceAlgos;

public class ReverseCharacter
{
    String reverse = "";

    public String reverseString(String str)
    {

        if (str.length() == 1)
        {
            return str;
        }
        else
        {
            reverse += str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
            return reverse;

        }
    }

    public static void main(String a[])
    {
        String input = "Candid Java Programming";
        System.out.println("Input String:"+input);
        ReverseCharacter srr = new ReverseCharacter();

        System.out.println("\nResult: " + srr.reverseString(input));

    }

}
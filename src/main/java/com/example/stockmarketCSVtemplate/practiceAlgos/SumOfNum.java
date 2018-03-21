package com.example.stockmarketCSVtemplate.practiceAlgos;

class SumOfNum
{
    public static void main(String args[])
    {
        int sum = 0;
        for (int i = 1; i <= 100; i++)
        {
            if (i % 2 != 0)
            {
                sum += i;
            }
        }
        System.out.println("The Sum Of 100 odd numbers is " + sum);
    }
}

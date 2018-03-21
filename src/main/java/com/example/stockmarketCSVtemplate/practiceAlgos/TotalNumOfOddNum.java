package com.example.stockmarketCSVtemplate.practiceAlgos;

class TotalNumOfOddNum
{
    public static void main(String args[]){

        System.out.println(TotalNumofOddNum(100));

    }

    public static int TotalNumofOddNum(int n){

        int count = 0;
        for(int i = 1; i <= n; i++ ){
            if (i % 2 != 0){
                count++;
            }
        }
        return count;
    }

}


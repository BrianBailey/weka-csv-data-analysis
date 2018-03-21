package com.example.stockmarketCSVtemplate.practiceAlgos;

public class TotalNumOfOddNumAlgo {





    public int totalNumofOddNum(int n){

        int count = 0;
        for(int i = 1; i <= n; i++ ){
            if (i % 2 != 0){
                count++;
            }
        }
        return count;
    }

}

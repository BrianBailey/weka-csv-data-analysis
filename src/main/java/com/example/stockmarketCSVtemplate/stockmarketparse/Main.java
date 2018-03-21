package com.example.stockmarketCSVtemplate.stockmarketparse;

import java.io.*;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Iterator;
        import java.util.List;

// java.util.*;      can use this as well

public class Main {

    public static void main(String[] args) {

        StockData stockData = new StockData();
        //ArrayList<StockRecord> records = new ArrayList<>()

        //"C:\\stocks\\csv-capstone-db\\master_gm_news_pos_neg.csv"
        //src/main/resources/3_day_gm_data.csv
        stockData.loadDataFromFile("C:\\stocks\\csv-capstone-db\\\\master_gm_news_pos_neg.csv");

        //System.out.println(stockData.getPosNewzRecord());

        System.out.println("Record 1 is: "+ stockData.getRecordNumber(0));
        System.out.println();
//
//        System.out.println("Record 2 is: "+ stockData.getRecordNumber(1));
//        System.out.println();
//
//        System.out.println("Record 3 is: "+ stockData.getRecordNumber(2));
//        System.out.println();
        System.out.println("Largest high is: " + stockData.getLargestHigh());
        System.out.println();

        System.out.println("Lowest low is: " + stockData.getLowestLow());
        System.out.println();

        System.out.println("Largest opening close difference is: " + stockData.getLargestOpeningClosingDiff());
        System.out.println();

        System.out.println("Largest high low difference is: " + stockData.getLargestHighLowDiff());
        System.out.println();

        System.out.println("Number of records is: "+ stockData.getNumberOfRecords());




//        System.out.println("Number of records is: "+stockData.getNumberOfRecords());
//        System.out.println();

        //System.out.println("Breaking news into words: " + Arrays.toString(stockData.getNewsWords().getNews().split(" ")));

//        System.out.println("Record 0 is: "+ stockData.getRecordNumber(17));
//        System.out.println();
//
//       System.out.println("Record 1 is: "+ stockData.getRecordNumber(1));
//       System.out.println();
////
////




    }

}
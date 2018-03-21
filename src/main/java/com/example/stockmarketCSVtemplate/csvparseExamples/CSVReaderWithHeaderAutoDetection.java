package com.example.stockmarketCSVtemplate.csvparseExamples;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.util.stream.*;

import java.math.BigDecimal;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CSVReaderWithHeaderAutoDetection {
    private static final String SAMPLE_CSV_FILE_PATH = "C:\\stocks\\csv-capstone-db\\master-5-year-gm-w-news.csv";

    private static final String SAMPLE_CSV_FILE = "C:\\stocks\\csv-capstone-db\\sample-2-22-capstone.csv";

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim());

                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("date", "record number","open close decrease","percentage decrease","word list"));
        ) {
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            //System.out.println("Info to csv: Date, record#, open > close amt, percentage, news words for date ");
            //System.out.println(CSVRecord.class

            for (CSVRecord csvRecord : csvRecords) {
                // Accessing values by Header names



                String date = csvRecord.get("date");
                double open = Double.parseDouble(csvRecord.get("open"));
                double high = Double.parseDouble(csvRecord.get("high"));
                double low = Double.parseDouble(csvRecord.get("low"));
                double close = Double.parseDouble(csvRecord.get("close"));
                BigDecimal volume = new BigDecimal(csvRecord.get("volume"));
                String name = csvRecord.get("name");
                String news = csvRecord.get("news");

                //String columnOne = csvRecord.get(1);
                //System.out.println(columnOne);

                //String num = csvRecord.get("Favorite Number");
//                int count = 0;
//
//                if (news.length() > 250){
//                    count += 1;
//                }
//                System.out.println(count);

                //String newz = csvRecord.get("news").split(" ");// array of strings

                //double sum = sum(high);  // this is in your main code -> no loop (visible)

                //double sum = DoubleStream.of(open).sum() - DoubleStream.of(close).sum();
                //System.out.println(sum);


                //String newz = Arrays.toString(news.split(" "));

                //System.out.println("Record No : " + csvRecord.getRecordNumber());
               // System.out.println("Date: " + date);
                //int count = 0;


                //System.out.println();


                /*if (open > close){
                    System.out.print(date + " ");
                    System.out.print(csvRecord.getRecordNumber() + "   ");
                    System.out.println((open - close) + " ");
                    System.out.println(((open -close)/open) + " % ");
                    System.out.println(Arrays.toString(news.split(" ")));//  this is showing that news is a string
                    System.out.println();
                    String newz = Arrays.toString(news.split(" "));

                    csvPrinter.printRecord(date,csvRecord.getRecordNumber(),(open - close), (open - close)/open,newz);
                    //csvPrinter.printRecord(newz);
                    //(open -close)/open)
                }
                */

                //System.out.println(csvRecord.size());


                //System.out.println(open/close);
                //System.out.println(csvRecord.size());
//                System.out.println(date);
//                System.out.println(open - high);

                //csvPrinter.printRecord(date,Math.abs(open-high));
                //System.out.print(date +" ");
               // System.out.println(Arrays.toString(news.split(" ")));//  this is showing that news is a string


//                System.out.println("Record No - " + csvRecord.getRecordNumber());
//                System.out.println("---------------");
//                System.out.println("date : " + date);
//                  // ******csvPrinter.printRecord( date,news);   this is great can in effect show and send instant data
//                System.out.println("open : " + open);
//                System.out.println("high : " + high);
//                System.out.println("low : " + low);
//                System.out.println("close : " + close);
//                System.out.println("volume : " + volume);
//                System.out.println("name : " + name);
//                System.out.println("news : "+ news);
//                 //csvPrinter.printRecord("news : " + news);
////                System.out.println(Arrays.toString(news.split(" ")));
//                System.out.println("---------------\n\n");
            }
        }

    }

}

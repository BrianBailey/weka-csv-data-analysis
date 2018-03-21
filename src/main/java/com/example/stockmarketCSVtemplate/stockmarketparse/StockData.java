package com.example.stockmarketCSVtemplate.stockmarketparse;

import java.io.FileReader;
import java.math.BigDecimal;
import java.util.*;

public class StockData {

    private ArrayList<StockRecord> records = new ArrayList<>();




    public StockData() {

        //records = new ArrayList<>();     can put this instantiation in here as well.
    }


    public StockRecord getRecordNumber(int i) {
        return records.get(i);
    }




    public int getNumberOfRecords() {
        return records.size();
    }






    // reads the file in filepath Creates stockRecord objects and adds them to records
    public void loadDataFromFile(String filepath) {
        try {
            Scanner scanner = new Scanner(new FileReader(filepath));
            String line;
            StockRecord record;

            scanner.nextLine();
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();   // get the line
                String[] results = line.split(",");  // split it on ,
                String date = (results[0]);
                double open = Double.parseDouble(results[1]); // parse the results
                double high = Double.parseDouble(results[2]);
                double low = Double.parseDouble(results[3]);
                double close = Double.parseDouble(results[4]);
                BigDecimal volume = new BigDecimal(results[5]);
                String name = (results[6]);
                String news = (results[7]);
                String posword = (results[8]);
                String negword = (results[9]);




                /*... etc... */
                //create the record
                record = new StockRecord(date, open, high, low, close, volume, name, news, posword, negword);
                records.add(record);     // add the record
            }
            scanner.close();


        } catch (Exception e) {
            System.out.println("Error: + e.getMessage()");
        }

    }

    public StockRecord getLargestHigh() {
        //StockRecordtodelete highest = null;

        StockRecord highest = records.get(0);
        for (StockRecord record : records) {
            if (record.getHigh() > highest.getHigh()) {
                highest = record;
            }

        }
        return highest;
    }

    public StockRecord getLargestOpeningClosingDiff() {

        StockRecord largest = records.get(0);
        for (StockRecord record : records) {
            if (Math.abs(largest.getOpen() - largest.getClose()) > Math.abs(record.getOpen() - record.getClose())) {
                largest = record;
            }

        }
        return largest;
    }





    public StockRecord getLowestLow() {


        StockRecord lowest = records.get(0);
        //System.out.println(lowest);
        for (StockRecord record : records) {
            if (lowest.getLow() > record.getLow()) {
                lowest = record;
            }

        }
        return lowest;
    }



    public StockRecord getLargestHighLowDiff() {
        //StockRecordtodelete highest = null;

        StockRecord largest = records.get(0);
        for (StockRecord record : records) {
            if (Math.abs(largest.getHigh() - largest.getLow()) > Math.abs(record.getHigh() - record.getLow())) {
                largest = record;
            }

        }
        return largest;
    }




}


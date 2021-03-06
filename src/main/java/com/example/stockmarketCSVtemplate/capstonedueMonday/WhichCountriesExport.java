package com.example.stockmarketCSVtemplate.capstonedueMonday;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class WhichCountriesExport {
    private static final String SAMPLE_CSV_FILE_PATH = "C:\\stocks\\csv-capstone-db\\exportdata.csv";
//    private static final String SAMPLE_CSV_FILE_PATH = "https://docs.google.com/spreadsheets/d/1AUKoDm7meCVQksf39HyDu78oLAiTqlwe9LrJl9S0kCE/edit#gid=1488101045";



    private static final String SAMPLE_CSV_FILE = "C:\\stocks\\csv-capstone-db\\which-export-countries-capstone.csv";

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim());

                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
 //                       .withHeader("date", "record number","open close decrease","percentage decrease","word list"));
                          .withHeader("countries"));
        ) {
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            //System.out.println("Info to csv: Date, record#, open > close amt, percentage, news words for date ");
            System.out.println();

            for (CSVRecord csvRecord : csvRecords) {
                //LOok at the "Exports" column
                String export = csvRecord.get("Exports");
                String country = csvRecord.get("Country");



                // Check if contains exportOfInterest
                if (export.contains("coffee")){
                    //If so ,  write down the "Couuntry" from that row
                    //String country = csvRecord.get("Country");
                    //csvPrinter.printRecord(country);
                    System.out.println(country);

                }


            }
        }

    }

}
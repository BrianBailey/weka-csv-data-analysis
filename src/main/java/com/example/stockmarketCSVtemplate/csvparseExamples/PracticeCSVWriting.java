package com.example.stockmarketCSVtemplate.csvparseExamples;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class PracticeCSVWriting {
    private static final String SAMPLE_CSV_FILE = "C:\\stocks\\sample-get-good-at-this.csv";

    public static void main(String[] args) throws IOException {
        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        //.withHeader("ID", "Name", "Designation", "Company"));
                        .withHeader("numbers", "names"));
        ) {

            for (int i = 0; i < 20; i++){
                csvPrinter.printRecord(i);
                csvPrinter.printRecord(i+1,"Asher");

            }

            csvPrinter.printRecord("Brian");
//            csvPrinter.printRecord("1", "Sundar Pichai ♥", "CEO", "Google");
//            csvPrinter.printRecord("2", "Satya Nadella", "CEO", "Microsoft");
//            csvPrinter.printRecord("3", "Tim cook", "CEO", "Apple");
//
//            csvPrinter.printRecord(Arrays.asList("4", "Mark Zuckerberg", "CEO", "Facebook"));

            csvPrinter.flush();
        }
    }
}
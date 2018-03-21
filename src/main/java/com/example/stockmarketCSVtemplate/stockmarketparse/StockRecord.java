package com.example.stockmarketCSVtemplate.stockmarketparse;

import java.math.BigDecimal;

public class StockRecord {

    private String date;
    private double open, high , low, close;
    private BigDecimal volume;
    private String name,news, posword,negword;

    public StockRecord(String date, double open, double high, double low, double close, BigDecimal volume, String name, String news, String posword, String negword) {
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.name = name;
        this.news = news;
        this.posword = posword;
        this.negword = negword;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getPosword() {
        return posword;
    }

    public void setPosword(String posword) {
        this.posword = posword;
    }

    public String getNegword() {
        return negword;
    }

    public void setNegword(String negword) {
        this.negword = negword;
    }


    public String toString() {
        return "date: "+ date + " open: " +   open + " high: "+ high+ "  low: " + low+ "  close: " + close + " volume: " + volume + " name: " + name + " news: "+ news + " posword: "+ posword + " negword: "+ negword;
    }
}
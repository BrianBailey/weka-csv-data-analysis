package com.example.stockmarketCSVtemplate.capstonedueMonday;

public class Point {

    private int x;
    private int y;

    public Point(int startx, int starty){

        x = startx;
        y = starty;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public double distance(Point otherPt){

        int dx = x - otherPt.getX();
        int dy = y - otherPt.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

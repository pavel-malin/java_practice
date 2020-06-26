package com.company;

class ByTwos0 implements Series {
    int start;
    int val;

    ByTwos0() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class ByThees0 implements Series {
    int start;
    int val;


    ByThees0() {
        start = 0;
        val = 0;
    }
    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}


public class SeriesDemo0 {
    public static void main(String[] args) {
        ByTwos0 twoOb = new ByTwos0();
        ByThees0  theeOb = new ByThees0();
        Series ob;

        for(int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Next value ByTwos: " + ob.getNext());
            System.out.println("Next value ByThees: " + ob.getNext());
        }
    }
}

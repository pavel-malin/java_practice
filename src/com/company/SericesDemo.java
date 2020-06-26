package com.company;

interface Series {
    int getNext();
    void reset();
    void setStart(int x);
}

class ByTows implements Series {
    int start;
    int val;
    int prev;

    ByTows() {
        start = 0;
        val = 0;
        prev = -2;
    }
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    @java.lang.Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }


}

class SeriesDemo {
    public static void main(String[] args) {
        ByTows ob = new ByTows();

        for(int i=0; i < 5; i++)
            System.out.println("Next value: " + ob.getNext());
        System.out.println("\nReset");
        ob.reset();

        for(int i = 0; i < 5; i++)
            System.out.println("Next value: " + ob.getNext());
        System.out.println("\nInitial value: 100");
        ob.setStart(100);

        for(int i = 0; i < 5; i++)
            System.out.println("Next value: " + ob.getNext());
    }
}

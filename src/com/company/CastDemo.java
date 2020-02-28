package com.company;

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y);
        System.out.println("Init x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Results b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Results b != 257: " + b);

        b = 88; // X in code ASCII
        ch = (char) b;
        System.out.println("Results ch: " + ch);
    }
}

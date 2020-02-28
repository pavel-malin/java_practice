package com.company;

public class ScopeDome {
    public static void main(String[] args) {
        int x;

        x = 10;
        if (x == 10) {
            int y = 20;

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;

        }
        // y = 100; Error! In this place the variable y is not available
        System.out.println("x - " + x);
    }
}

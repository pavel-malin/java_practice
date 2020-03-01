package com.company;

public class Guess1 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("Designed a letter from the range A-Z.");
        System.out.print("Try to guess her: ");

        ch = (char) System.in.read();

        if (ch == answer)
            System.out.println("*** OK ***");
        else
            System.out.println("Sorry!");
    }
}

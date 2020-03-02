package com.company;

public class Guess3 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, ignore, answer = 'K';

        do {
            System.out.println("A letter from a range is conceived A-Z.");
            System.out.print("Try to guess her: ");

            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer)
                System.out.println("*** OK ***");
            else {
                System.out.print("... Sorry, the letter you need is ");
                if (ch < answer)
                    System.out.println("closer to the end of the alphabet");
                    else
                        System.out.println("closer to the center of the alphabet");
                    System.out.println("Try again!\n");
            }
        } while (answer != ch);
    }
}

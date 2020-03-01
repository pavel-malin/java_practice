package com.company;

public class Guess2 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("A letter from a range is conceived A-Z.");
        System.out.print("Try to guess her: ");

        ch = (char) System.in.read();

        if(ch == answer)
            System.out.println("*** OK ***");
        else
            System.out.println("Sorry!! ");

            if (ch < answer)
                System.out.println("closer to the end of the alphabet ");
            else
                System.out.println("closer to the beginning of the alphabet ");
    }
}

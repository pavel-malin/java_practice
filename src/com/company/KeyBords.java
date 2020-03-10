package com.company;

public class KeyBords {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch;
            int space = 0;

            do {
                ch = (char) System.in.read();
                if (ch == ' ') space++;
            } while (ch != '.');

            System.out.println("Space: " + space);
    }
}

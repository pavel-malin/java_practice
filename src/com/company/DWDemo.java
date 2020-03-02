package com.company;

public class DWDemo {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        do {
            System.out.print("Press the desired key and then ENTER: ");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}

package com.company;

public class Break1 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        for ( ; ; ) {
            ch = (char) System.in.read();

            if (ch == 'q')
                break;
        }
        System.out.println("Enter key q!");
    }
}

package com.company;

public class KbIn {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        System.out.print("Enter button, next keys Return: ");

        ch = (char) System.in.read();
        System.out.println("Print button keys: " + ch);

    }

}

package com.company;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("Value b: " + b);
        b = true;
        System.out.println("Value b: " + b);

        if (b)
            System.out.println("Ok");

        b = false;
        if (b)
            System.out.println("No ok");
        System.out.println("10 > 9: " + (10 > 9));
    }
}

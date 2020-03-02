package com.company;

public class BreakDemo {
    public static void main(String[] args) {
        int num;

        num = 100;

        for (int i = 0; i < num; i++) {
            if (i * i >= num)
                break;
                        // else i*i >= 100
            System.out.print(i + " ");
        }
        System.out.println("For end.");
    }
}

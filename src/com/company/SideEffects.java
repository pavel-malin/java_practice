package com.company;

public class SideEffects {
    public static void main(String[] args) {
        int  i;

        i = 0;
        if (false & (++i < 100))
            System.out.println("Not strings");
        System.out.println(i);
        // i = 1
        if (false && (++i < 100))
            System.out.println("Not strings");
        System.out.println(i);
        // i = 1 !!!
    }
}

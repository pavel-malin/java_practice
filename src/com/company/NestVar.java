package com.company;
/*
    This program attempts to declare a variable with the
    same name in the inner scope as the variable declared in
    the outer scope.

    *** This program will not be copied ***
 */

public class NestVar {
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 10; count++) {
            System.out.println("Count " + count);
            /*
            int count;
            for (count = 0; count < 2; count++)
                System.out.println("Errors!!!!");
             */
        }

    }
}

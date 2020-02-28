package com.company;

public class Prame {
    public static void main(String[] args) {
        int i, j;
        boolean isprame;

        for (i = 2; i < 100; i++) {
            isprame = true;
            for (j = 2; j <= i/j; j++)
                if ((i%j) == 0)
                    isprame = false;
            if (isprame)
                System.out.println(i);
        }

    }
}

package com.company;

public class Break2 {
    public static void main(String[] args) {

        for (int i=0; i<3; i++) {
            System.out.println("Outer cycle counter: " + i);
            System.out.print("     Outer cycle counter:    ");

            int t = 0;
            while (t < 100) {
                if (t == 10)
                    break;
                System.out.print(t + " ");
                t ++;
            }
            System.out.println();
        }
        System.out.println("For end.");
    }
}

package com.company;

public class Break4 {
    public static void main(String[] args) {

done:
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                for (int k=0; k<10; k++) {
                    System.out.println(k + " ");
                    if (k==5)
                        break done;
                }
                System.out.println("After cycle k"); // not print
            }
            System.out.println("After cycle j"); // not print
        }
        System.out.println("After cycle i");
    }
}

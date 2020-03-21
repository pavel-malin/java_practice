package com.company;

class NoZeroDiv2 {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++)
            if (i != 0 ? true : false)
                System.out.println("100 / " + i + " equally " + 100 / i);
    }
}

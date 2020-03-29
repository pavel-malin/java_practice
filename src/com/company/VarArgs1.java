package com.company;

class VarArgs1 {
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Content: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One argument in an array: ", 10);
        vaTest("Three arguments in an array: ", 1, 2, 3);
        vaTest("Missing Array Arguments: ");
    }
}

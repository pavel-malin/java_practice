package com.company;

class VarArgs2 {
    static void vaTest(int ... v) {
        System.out.println("vaTest(int ... v): " + "Number of arguments: " + v.length);
        System.out.println("Content: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.println("vaTest(boolean ... v): " + "Number of arguments: " + v.length);
        System.out.println("Content: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    static void vaTest(String msg, int ... v) {
        System.out.println("vaTest(String, int ... v): " + msg + v.length);
        System.out.println("Content: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Test's: ", 10, 20);
        vaTest(true, false, false);
    }
}

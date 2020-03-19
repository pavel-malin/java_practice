package com.company;

class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"One", "Two", "Three"};

        System.out.println("Source array: ");
        for (String s: strs)
            System.out.print(s + " ");
        System.out.println("\n");

        strs[1] = "Hello bro!";
        strs[2] = "Like Java!";

        System.out.println("Array change: ");
        for (String s: strs)
            System.out.print(s + " ");
    }
}

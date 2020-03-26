package com.company;

class StaticMeth {
    static int val = 1024;

    static int valDiv2() {
        return val/2;
    }
}

class SDemo0 {
    public static void main(String[] args) {
        System.out.println("Value val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

        StaticMeth.val = 4;
        System.out.println("Value val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

    }
}

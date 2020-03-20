package com.company;

class ShowBit {
    int numbits;

    ShowBit(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;

        mask <<= numbits - 1;

        int spacer = 0;

        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0)
                System.out.print("1");
            else
                System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBit b = new ShowBit(8);
        ShowBit i = new ShowBit(32);
        ShowBit li = new ShowBit(64);

        System.out.println("123 in binary representation: ");
        b.show(123);

        System.out.println("\n97987 in binary representation: ");
        i.show(87987);

        System.out.println("\n237658768 in binary representation: ");
        li.show(237658768);

        System.out.println("\nLow 8 bits of a number 87987 " +
                "in binary representation: ");
        b.show(87987);
    }
}

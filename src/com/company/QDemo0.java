package com.company;

class Queue0 {
    private char q[];
    private int putloc, getloc;

    Queue0(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            System.out.print("\n");
        }
        return q[getloc++];
    }
}

class QDemo0 {
    public static void main(String[] args) {
        Queue0 bigQ = new Queue0(100);
        Queue0 smallQ = new Queue0(4);
        char ch;
        int i;


        System.out.println("Using the bigQ Queue to Preserve the Alphabet");

        for (i=0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }
        System.out.print("BigQ queue contents: ");
        for (i=0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0)
                System.out.print(ch);

        }

        System.out.println("\n");

        System.out.println("Using the smallQ queue to generate an error");
        for (i=0; i < 5; i++) {
            System.out.print("Attempt to save " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        System.out.print("SmallQ queue contents: ");
        for (i=0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0)
                System.out.print(ch);
        }
    }
}


package com.company;

class Queue {
    char q[];
    int number[];
    double d[];
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
        number = new int[size];
        d = new double[size];
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    void put_int(int ch_i) {
        if (putloc == number.length) {
            System.out.println(" - Queue is full");
        } else {
            number[putloc++] = ch_i;
        }
    }

    void put_double(double ch_d) {
        if (putloc == d.length) {
            System.out.println(" - Queue is full");
        } else {
            d[putloc++] = ch_d;
        }
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            System.out.print("\n");
        }
        return q[getloc++];
    }
    int get_in() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
        }
        return number[getloc++];
    }
    double get_double() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
        }
        return d[getloc++];
    }

}

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int ch_i = 0;
        double ch_d = 0;
        int i;


        System.out.println("Using the bigQ Queue to Preserve the Alphabet");

        for (i=0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }
        System.out.print("BigQ queue contents: ");
        for (i=0; i < 26; i++) {
            ch = bigQ.get();
            ch_i = bigQ.get_in();
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

        System.out.println("Using the bigQ Queue to Preserve the Number(int)");

        for (i=0; i < 26; i++) {
            bigQ.put_int(i);
        }
        System.out.print("BigQ queue contents: ");
        for (i=0; i < 26; i++) {
            ch_i = bigQ.get_in();
            if (ch_i != 0) {
                System.out.print(ch_i);
            }
        }

        System.out.println("\n");

        System.out.println("Using the smallQ queue to generate an error");
        for (i=0; i < 5; i++) {
            System.out.print("Attempt to save " +  ch_i + i);

            smallQ.put_int(i);
            System.out.println();
        }
        System.out.println();
        System.out.print("SmallQ queue contents: ");
        for (i=0; i < 5; i++) {
            ch_i = smallQ.get_in();
            if (ch_i != 0)
                System.out.print(ch_i);
        }

        System.out.println("Using the bigQ Queue to Preserve the Number(double)");

        for (i=0; i < 26; i++) {
            bigQ.put_double(i);
        }
        System.out.print("BigQ queue contents: ");
        for (i=0; i < 26; i++) {
            ch_d = bigQ.get_double();
            if (ch_d != 0) {
                System.out.print(ch_d);
            }
        }

        System.out.println("\n");

        System.out.println("Using the smallQ queue to generate an error");
        for (i=0; i < 5; i++) {
            System.out.print("Attempt to save " +  ch_d + i);

            smallQ.put_double(i);
            System.out.println();
        }
        System.out.println();
        System.out.print("SmallQ queue contents: ");
        for (i=0; i < 5; i++) {
            ch_d = smallQ.get_double();
            if (ch_d != 0)
                System.out.print(ch_d);
        }
    }
}

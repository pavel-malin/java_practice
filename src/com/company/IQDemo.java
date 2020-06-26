package com.company;

interface ICharQ {
    char put(char ch);
    char get();
}

class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public char put(char ch) {
        if (putloc == q.length) {
            System.out.println("- Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }

    public char get() {
        return 0;
    }
}

class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }

    public char put(char ch) {
        return 0;
    }

    public char get() {
        return 0;
    }
}

class DynQeue implements ICharQ {
    private char q[];
    private int putloc, getloc;
    private char ch;

    public DynQeue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public char put(char ch) {
        this.ch = ch;
        if(putloc == q.length) {
            char t[] = new char[q.length * 2];

            for(int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        q[putloc++] = ch;
        return ch;
    }

    public char get() {
        if(getloc == putloc) {
            System.out.println("- Queue is empty ");
            return (char) 0;
        }
        return q[getloc++];
    }
}

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQeue q2 = new DynQeue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;
        char ch;
        int i;
        iQ = q1;

        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        iQ = q2;

        for(i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));
        System.out.print("Ring Queue Content: ");
        for(i = 0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;

        for(i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));
        System.out.print("Ring Queue Content: ");

        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        for(i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));

        System.out.print("Ring Queue Content: ");

        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.print("\nSaving and using ring queue data.");

        for(i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }

}

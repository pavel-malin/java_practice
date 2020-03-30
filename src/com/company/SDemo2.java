package com.company;

class Stack {
    private char stck[];
    private int tos;

    Stack (int size) {
        stck = new char[size];
        tos = 0;
    }

    Stack (Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        for (int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    Stack (char a[]) {
        stck = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    void push(char ch) {
        if (tos == stck.length) {
            System.out.println(" -- The stack if full");
            return;
        }

        stck[tos] = ch;
        tos++;
    }

    char pop() {
        if (tos == 0) {
            System.out.println(" -- Stack is empty");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }
}

class SDemo2 {
    public static void main(String[] args) {
        Stack stck1 = new Stack(10);
        char name[] = {'T', 'o', 'm'};
        Stack stck2 = new Stack(name);
        char ch;
        int i;

        for (i = 0; i < 10; i++)
            stck1.push((char) ('A' + i));

        Stack stck3 = new Stack(stck1);

        System.out.print("Content stck1: ");

        for (i = 0; i < 10; i++) {
            ch = stck1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Content stck2: ");

        for (i = 0; i < 10; i++) {
            ch = stck2.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Content stck3: ");

        for (i = 0; i < 10; i++) {
            ch = stck3.pop();
            System.out.print(ch);
        }
    }
}

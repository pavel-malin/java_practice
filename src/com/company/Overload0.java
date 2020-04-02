package com.company;

class A2 {
    int i, j;

    A2(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B2 extends A2 {
    int k;

    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Overload0 {
    public static void main(String[] args) {
        B2 subOb = new B2(1, 2, 3);
        subOb.show("k: ");
        subOb.show();
    }
}

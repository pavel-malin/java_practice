package com.company;

class X {
    int a;
    X(int i) {
        a = i;
    }
}

class Y {
    int a;
    Y(int i) {
        a = i;
    }
}

class IncompatibleRef {
    public static void main(String[] args) {
        X  x = new X(10);
        X x2;
        Y y = new Y(15);

        x2 = x;
        // x2 = y; ERROR!!!!
    }
}

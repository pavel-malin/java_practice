package com.company;

class X0 {
    int a;
    X0(int i) {
        a = i;
    }
}

class Y0 extends X0 {
    int b;
    Y0(int i, int j) {
      super(j);
      b = j;
    }
}

class SupSubRef {
    public static void main(String[] args) {
        X0 x = new X0(10);
        X0 x2;
        Y0 y = new Y0(5, 6);

        x2 = x;
        System.out.println("x2.a: " + x2.a);

        x2 = y;
        System.out.println("x2.a: " + x2.a);

        x2.a = 19;
        // x2.b = -27 ERROR!!!
    }
}

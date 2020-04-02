package com.company;

class Sup {
    void who() {
        System.out.println("who() on Sup");
    }
}

class Sub1 extends Sup {
    void who() {
        System.out.println("who() on Sub1");
    }
}

class Sub2 extends Sup {
    void who() {
        System.out.println("who() on Sub2");
    }
}

class DynDispDemo {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;

        supRef = superOb;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();
    }
}

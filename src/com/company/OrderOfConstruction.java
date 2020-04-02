package com.company;

class A {
    A() {
        System.out.println("Construction A ");
    }
}

class B extends A {
    B() {
        System.out.println("Construction B ");
    }
}

class C extends B {
    C() {
        System.out.println("Construction C ");
    }
}

class OrderOfConstruction {
    public static void main(String[] args) {
        C c = new C();
    }
}

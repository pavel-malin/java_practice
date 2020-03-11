package com.company;

class MyClass0 {
    int x;

    MyClass0(int i) {
        x = i;
    }
}

class ParmConsDemo {
    public static void main(String[] args) {
        MyClass0 t1 = new MyClass0(10);
        MyClass0 t2 = new MyClass0(88);

        System.out.println(t1.x + " " + t2.x);
    }
}

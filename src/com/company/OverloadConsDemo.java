package com.company;

class ClassMy {
    int x;

    ClassMy() {
        System.out.println("Inside ClassMy().");
        x = 0;
    }

    ClassMy(int i) {
        System.out.println("Inside ClassMy(int).");
        x = i;
    }

    ClassMy(double d) {
        System.out.println("Inside ClassMy(double).");
        x = (int) d;
    }

    ClassMy(int i, int j) {
        System.out.println("Inside ClassMy(int, int).");
        x = i * j;
    }
}

class OverloadConsDemo {
    public static void main(String[] args) {
        ClassMy t1 = new ClassMy();
        ClassMy t2 = new ClassMy(88);
        ClassMy t3 = new ClassMy(17.23);
        ClassMy t4 = new ClassMy(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}

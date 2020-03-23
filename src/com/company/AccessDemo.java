package com.company;

class MyClass1 {
    private int alpha;
    public int beta;
    int gamma;

    void setAlpha(int a) {
        alpha = a;
    }
    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main(String[] args) {
        MyClass1 ob = new MyClass1();

        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        // ob.alpha = 10; Error's

        ob.beta = 88; // not error's
        ob.gamma = 99; // not error's
    }
}

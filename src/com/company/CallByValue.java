package com.company;

class Test {
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b before calling: " + a + " " + b);

        ob.noChange(a, b);

        System.out.println("a and b after calling: " + a + " " + b);
    }
}

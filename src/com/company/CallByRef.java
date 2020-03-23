package com.company;

class Test0 {
    int a, b;

    Test0(int i, int j) {
        a = i;
        b = j;
    }

    void change(Test0 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class CallByRef {
    public static void main(String[] args) {
        Test0 ob = new Test0(15, 20);

        System.out.println("a and b before calling: " + ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("a and b after calling: " + ob.a + " " + ob.b);
    }
}

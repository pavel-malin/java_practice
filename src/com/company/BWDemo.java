package com.company;

class Backwards {
    String str;
    Backwards(String s) {
        str = s;
    }

    void backward(int idx) {
        if (idx != str.length() - 1)
            backward(idx + 1);
    }
}

class BWDemo {
    public static void main(String[] args) {
        Backwards s = new Backwards("This text");
        s.backward(0);
    }
}

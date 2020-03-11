package com.company;

class Pwr {
    double b;
    int e;
    double val;

    Pwr (double base, int exp) {
        b = base;
        e = exp;

        val = 1;
        if (exp == 0)
            return;
        for ( ; exp>0; exp--)
            val = val * base;
    }

    double get_pwr() {
        return val; // this.val;
    }
}

class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " to the extent " + x.e +
                " equally " + x.get_pwr());
        System.out.println(y.b + " to the extent " + y.e +
                " equally " + y.get_pwr());
        System.out.println(z.b + " to the extent " + z.e +
                " equally " + z.get_pwr());
    }
}

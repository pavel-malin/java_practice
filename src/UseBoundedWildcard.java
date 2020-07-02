class Au {
    //..
}

class Bu extends Au {
    //..
}

class C extends Au {
    //..
}

class D extends Au {
    //..
}

class Genu<T> {
    T ob;

    Genu(T o) {
        ob = o;
    }


    static void test(Genu<? extends A> o) {
        //..
    }
}

public class UseBoundedWildcard {
    static void test(Genu<? extends A> o) {
        //..
    }

    public static void main(String[] args) {
        Au a = new Au();
        Bu b = new Bu();
        C c = new C();
        D d = new D();

        Gen<Au> w = new Gen<Au>(a);
        Gen<Bu> w2 = new Gen<Bu>(b);
        Gen<C> w3 = new Gen<C>(c);
        Gen<D> w4 = new Gen<D>(d);

        test(w);
        test(w2);
        test(w3);
    }
}

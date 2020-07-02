class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1,V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void ShowTypes() {
        System.out.println("Type T - it " + ob1.getClass().getName());
        System.out.println("Type V - it " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Communication");
        tgObj.ShowTypes();

        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str);
    }
}

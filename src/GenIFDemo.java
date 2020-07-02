interface Containment<T> {
    boolean contains(T o);
}

class MyClassg<T> implements Containment<T> {
    T[] arrayRef;

    MyClassg(T[] o) {
        arrayRef = o;
    }

    public boolean contains(T o) {
        for (T x: arrayRef)
            if (x.equals(o))
                return true;
            return false;
    }
}

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] x = {1, 2, 3};
        MyClassg<Integer> ob = new MyClassg<Integer>(x);
        if (ob.contains(2))
            System.out.println("2 contained in ob");
        else
            System.out.println("2 not contained in ob");
        if (ob.contains(5))
            System.out.println("5 contained in ob");
        else
            System.out.println("5 not contained in ob");
    }
}

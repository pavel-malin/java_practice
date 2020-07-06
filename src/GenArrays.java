class Gena<T extends Number> {
    T ob;
    T[] vals;

    Gena(T o, T[] nums) {
        ob = o;
     //   vals = new T[10];
        vals = nums;
    }
}

public class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        Gena<Integer> iOb = new Gena<Integer>(50, n);
        // Gena<Integer>[] gens = new Gena<Intger>[10]; ERROR
        Gena<?>[] gens = new Gena<?>[10];
    }
}

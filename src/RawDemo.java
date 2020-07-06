class Genr<T> {
    T ob;

    Genr(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

public class RawDemo {
    public static void main(String[] args) {
        Genr<String> strOb = new Genr<String>("Generalization Testing");
        Genr raw = new Genr(new Double(98.6));

        double d = (Double) raw.getOb();
        System.out.println("value: " + d);

        int i = (Integer) raw.getOb();
        strOb = raw;
        String str = strOb.getOb();
        // raw = iOb;
        d = (Double) raw.getOb();

    }
}

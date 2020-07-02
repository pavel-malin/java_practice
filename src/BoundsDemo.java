class NumericFns<T extends Number> {
    T num;

    NumericFns(T n) {
        num = n;
    }

    double reciprocal() {
        return 1/num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }
}

public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);
        System.out.println("Return iOb - " + iOb.reciprocal());
        System.out.println("Fractional part iOb - " + iOb.fraction());
        System.out.println();

        NumericFns<Double> dOb = new NumericFns<Double>(5.25);
        System.out.println("Return dOb - " + dOb.reciprocal());
        System.out.println("Fractional part dOb - " + dOb.fraction());
    }
}

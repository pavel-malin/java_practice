class NumericwFns<T extends Number> {
    T num;

    NumericwFns(T n) {
        num = n;
    }

    double reciprocal() {
        return 1/num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual(NumericwFns<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
}

public class WildcardDemo {
    public static void main(String[] args) {
        NumericwFns<Integer> iOb = new NumericwFns<Integer>(6);
        NumericwFns<Double> dOb = new NumericwFns<Double>(-6.0);
        NumericwFns<Long> lOb = new NumericwFns<Long>(5L);

        System.out.println("Compare iOb and dOb ");
        if (iOb.absEqual(dOb))
            System.out.println("Absolute values match ");
        else
            System.out.println("Absolute values differ ");
        System.out.println();

        System.out.println("Compare iOb and lOb ");
        if (iOb.absEqual(lOb))
            System.out.println("Absolute values match ");
        else
            System.out.println("Absolute values differ ");
    }
}

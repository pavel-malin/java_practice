interface NumericTest {
    boolean test(int n, int m);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isFactor = (n,d) -> (n%d) == 0;
        if (isFactor.test(10, 2))
            System.out.println("2 is a divider 10");
        if (isFactor.test(10, 3))
            System.out.println("4 not a divider 10");
        System.out.println();

        NumericTest lessThan = (n,m) -> (n<m);
        if (lessThan.test(2, 10))
            System.out.println("2 less 10");
        if (!lessThan.test(10, 2))
            System.out.println("10 not less 2");
        System.out.println();

        NumericTest absEqal = (n,m) -> (n<0 ? -n:m) == (m<0 ? -m:n);
        if (absEqal.test(4, -4))
            System.out.println("The absolute values 4 and -4 are equal");
        if (!absEqal.test(4, -5))
            System.out.println("The absolute values 4 and -5 are not equal");
    }
}

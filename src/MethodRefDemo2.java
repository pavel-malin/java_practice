interface IntPredicate2 {
    boolean test(int n);
}

class MyIntNum {
    private int v;

    MyIntNum(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v%n) == 0;
    }
}

public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);
        IntPredicate ip = myNum::isFactor;

        result = ip.test(3);
        if (result)
            System.out.println("3 is divisor " + myNum.getNum());
        ip = myNum2::isFactor;
        result = ip.test(3);
        if (!result)
            System.out.println("3 not is divisor " + myNum2.getNum());
    }
}

interface MyIntNumPredicate {
    boolean test(MyIntNum mv, int n);
}

class MyIntNum3 {
    private int v;

    MyIntNum3(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v%n) == 0;
    }
}

public class MethodRefDemo3 {
    public static void main(String[] args) {
        boolean result;
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);
        MyIntNumPredicate inp = MyIntNum::isFactor;
        result = inp.test(myNum, 3);

        if(result)
            System.out.println("3 is divisor " + myNum.getNum());
        result = inp.test(myNum2, 3);
        if (!result)
            System.out.println("3 not is divisor " + myNum2.getNum());
    }
}

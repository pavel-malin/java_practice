interface MyValue {
    double getValue();
}

interface MyParamValue {
    double getValue(double v);
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal;

        myVal = () -> 98.6;
        System.out.println("Constant value: " + myVal.getValue());

        MyParamValue myPVal = (n) -> 1.0/n;
        System.out.println("The reciprocal of 4 is " + myPVal.getValue(4));
        System.out.println("The reciprocal of 8 is " + myPVal.getValue(8));

    }
}

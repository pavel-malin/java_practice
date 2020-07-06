interface NumericFunc4 {
    int func(int n);
}

public class FactorialLambdaDemo {
    public static void main(String[] args) {
        NumericFunc4 factorial = (n) -> {
            int result = 1;
            for (int i=1; i<=n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Factorial 3 equal " + factorial.func(3));
        System.out.println("Factorial 5 equal " + factorial.func(5));
        System.out.println("Factorial 9 equal " + factorial.func(9));
    }
}

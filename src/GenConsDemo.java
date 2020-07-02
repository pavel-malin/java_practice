class Summation {
    private int sum;

    <T extends Number>Summation(T arg) {
        sum = 0;
        for (int i=0; i<=arg.intValue(); i++)
            sum += i;
    }

    int getSum() {
        return sum;
    }
}

public class GenConsDemo {
    public static void main(String[] args) {
        Summation ob = new Summation(4.0);
        System.out.println("The sum of integers from 0 to 4.0 is " + ob.getSum());
    }
}

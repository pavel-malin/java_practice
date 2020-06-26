
class ExcTest {
    static void genEception() {
        int nums[] = new int[4];
        System.out.println("Before throwing an exception");
        nums[7] = 10;
        System.out.println("This line will not be displayed");
    }
}

public class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genEception();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Going beyond the array!");
        }
        System.out.println("After catch statement");
    }
}

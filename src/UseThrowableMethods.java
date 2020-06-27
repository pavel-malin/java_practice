class ExcTestUt {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before throwing an exception");

        nums[7] = 10;
        System.out.println("This line will not be displayed.");
    }
}

public class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTestUt.genException();
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Standard message: ");
            System.out.println(exc);
            System.out.println("\nCall stack: ");
            exc.printStackTrace();
        }
        System.out.println("After catch statement");
    }
}

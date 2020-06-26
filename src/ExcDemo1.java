public class ExcDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Before throwing an exception");
            nums[7] = 10;

            System.out.println("This line will not be displayed");
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Going beyond the array!");
        }
        System.out.println("After catch statement");
    }
}

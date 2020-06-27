class UserFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];
        System.out.println("Received: " + what);

        try {
            switch(what) {
                case 0:
                    t = 10;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        }
        catch(ArithmeticException exc) {
            System.out.println("Zero division attempt");
            return;
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Matching item not found.");
        }
        finally {
            System.out.println("Exit try block");
        }
    }
}

public class FinallyDemo {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            UserFinally.genException(i);
            System.out.println();
        }
    }
}

interface StringTest {
    boolean test(String aStr, String bStr);
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;
        String str = "This is a test";

        System.out.println("Test string: " + str);
        if (isIn.test(str, "This is"))
            System.out.println("'This is' found");
        else
            System.out.println("'This is' not found");
        if (isIn.test(str, "xyz"))
            System.out.println("'xyz' found");
        else
            System.out.println("'xyz' not found");
    }
}

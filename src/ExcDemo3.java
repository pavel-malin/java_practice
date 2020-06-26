public class ExcDemo3 {
    public static void main(String[] args) {
        int numer[] = {4, 8, 16, 32, 64, 128};
        int demon[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + "/" + demon[i] + " = " + numer[i] / demon[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Zero division attempt");
            }
        }

    }
}

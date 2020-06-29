import java.io.*;

public class AvgNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double arg, t;
        System.out.println("How many numbers do you need to enter: ");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        }
        catch (NumberFormatException exc) {
            System.out.println("Wrong format");
            n = 0;
        }
        System.out.println("Input " + n + " value");

        for (int i=0; i<n; i++){
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            }
            catch (NumberFormatException exc) {
                System.out.println("Wrong format");
                t = 0.0;
            }
            sum += t;
        }

        arg = sum / n;
        System.out.println("Mean: " + arg);
    }
}

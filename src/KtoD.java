import java.io.*;

public class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Sign of the end of input - output 'stop'");
        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.println(": ");
                str = br.readLine();
                if(str.compareTo("stop") == 0)
                    break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        }
        catch (IOException exc) {
            System.out.println("Error input - output: " + exc);
        }
    }
}

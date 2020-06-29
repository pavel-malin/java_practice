import java.io.*;

public class ReadChars {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters; end of input - dot character");

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != '.');
    }
}

import java.io.*;

public class CopyFile0 {
    public static void main(String[] args) throws IOException {
        int i;

        if (args.length != 2) {
            System.out.println("Using CopeFile0 - source and destination");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1)
                    fout.write(i);
            } while (i != -1);
        }
        catch (IOException exc) {
            System.out.println("Input - output error: " + exc);
            return;
        }
    }
}

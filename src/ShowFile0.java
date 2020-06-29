import java.io.*;

public class ShowFile0 {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Using: ShowFile0 file_names");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1)
                    System.out.print((char) i);
            } while(i != -1);
        }
        catch (IOException exc) {
            System.out.println("Input - output error " + exc);
        }
    }
}

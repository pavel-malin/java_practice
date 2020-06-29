import java.io.*;

public class CompFiles {
    public static void main(String[] args) {
        int i=0, j=0;

        if (args.length != 2) {
            System.out.println("Using: CompFiles file1 file2");
            return;
        }
        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])){
            do {
                i = f1.read();
                j = f2.read();

                if (i != j)
                    break;
            } while (i != -1 && j != -1);
            if (i != j)
                System.out.println("File contents are different");
            else
                System.out.println("File contents match");
        }
        catch (IOException exc) {
            System.out.println("Error input - output: " + exc);
        }
    }
}

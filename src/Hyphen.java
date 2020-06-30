import java.io.*;

public class Hyphen {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if(args.length != 2) {
            System.out.println("Using: Hyphen from where to where");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if ((char) i == ' ')
                    i = ' ';
                if (i != -1)
                    fout.write(i);
            } while (i != -1);
        }
        catch (IOException exc) {
            System.out.println("Error closing input file.");
        }
        try {
            if (fin != null)
                fout.close();
        }
        catch (IOException exc) {
            System.out.println("Error closing input file.");
        }
    }
}

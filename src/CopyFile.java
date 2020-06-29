/*
    Copy a text file. When calling this program, the names of the
    the source and target file should be indicated.
 */

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileInputStream fout = null;
        
        if(args.length != 2) {
            System.out.println("Using: CopeFile - source and title");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileInputStream(args[1]);
            
            do {
                i = fin.read();
                if(i != -1)
                    fout.write(i);
            } while(i != -1);
        }
        catch (IOException exc) {
            System.out.println("Error during input - output: " + exc);
        } finally {
            try {
                if (fin != null)
                    fin.close();
            }
            catch(IOException exc) {
                System.out.println("Error closing input file");
            }
        }
        try {
            if (fout != null)
                fout.close();
        }
        catch (IOException exc) {
            System.out.println("Error closing output file");
        }
    }
}

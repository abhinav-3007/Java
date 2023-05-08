// Abhinav Goyal
// 11A
// Class to copy contents of file to new file

import java.io.*;

public class CopyFile
{
    public static void main(String[] args) throws IOException
    {
        try {
            // opening file to read
            FileReader fin = new FileReader("Product.txt");
            BufferedReader bin = new BufferedReader(fin);
            
            // opening file to write
            FileWriter fout = new FileWriter("Copy.txt");
            BufferedWriter bout = new BufferedWriter(fout);
            PrintWriter pout = new PrintWriter(bout);
            
            String text = "";
            // copying contents to new file
            while((text = bin.readLine()) != null) {
                pout.println(text);
            }
            // closing reader
            bin.close();
            fin.close();
            // closing writer
            pout.close();
            bout.close();
            fout.close();
        }catch(Exception e) {
            System.err.println(e);
        }
    }
}

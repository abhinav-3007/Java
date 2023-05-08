// Abhinav Goyal
// 11A
// Class to read previously created file

import java.io.*;

public class ReadFile
{
    public static void main(String[] args) throws IOException
    {
        try {
            // opening file to read
            FileReader fin = new FileReader("Product.txt");
            BufferedReader bin = new BufferedReader(fin);
            String text = "";
            
            while((text = bin.readLine()) != null) {
                System.out.println("Product Name: "+text);
                System.out.println("Cost: "+bin.readLine());
            }
            // closing reader
            bin.close();
            fin.close();
        }catch(Exception e) {
            System.err.println(e);
        }
    }
}

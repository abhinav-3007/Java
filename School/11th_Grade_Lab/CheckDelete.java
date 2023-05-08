// Abhinav Goyal
// 11A
// Class to read previously created file and check if records were deleted

import java.io.*;

public class CheckDelete
{
    public static void main(String[] args) throws IOException
    {
        try {
            // opening file to read
            FileReader fin = new FileReader("Copy.txt");
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

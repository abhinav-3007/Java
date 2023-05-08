// Abhinav Goyal
// 11A
// Class to append records to existing file

import java.io.*;

public class AppendFile
{
    public static void main(String[] args) throws IOException
    {
        try {
            // opening file to write
            FileWriter fout = new FileWriter("Product.txt", true);
            BufferedWriter bout = new BufferedWriter(fout);
            PrintWriter pout = new PrintWriter(bout);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            // loop to take user input and append to file
            for(int line = 0; line < 3; line++){
                System.out.println("Enter Product name:");
                pout.println(br.readLine());
                System.out.println("Enter Cost:");
                pout.println(br.readLine());
            }
            // closing writer
            pout.close();
            bout.close();
            fout.close();
        }catch(Exception e) {
            System.err.println(e);
        }
    }
}

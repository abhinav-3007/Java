// Abhinav Goyal
// 11A
// Class to create file with data accepted from user

import java.io.*;

public class CreateFile
{
    public static void main(String[] args) throws IOException
    {
        try {
            // opening file to write on
            FileWriter fout = new FileWriter("Product.txt");
            BufferedWriter bout = new BufferedWriter(fout);
            PrintWriter pout = new PrintWriter(bout);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // getting user input for records
            for(int line = 0; line < 5; line++) {
                System.out.println("Enter Product Name:");
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

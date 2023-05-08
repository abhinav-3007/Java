// Abhinav Goyal
// 11A
// Class to insert record into file

import java.io.*;

public class InsertFile
{
    public static void main(String[] args) throws IOException
    {
        try {
            // opening file to read
            FileReader fin = new FileReader("Product.txt");
            BufferedReader bin = new BufferedReader(fin);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            // opening file to write
            FileWriter fout = new FileWriter("Copy.txt");
            BufferedWriter bout = new BufferedWriter(fout);
            PrintWriter pout = new PrintWriter(bout);
            
            String text = bin.readLine();
            int record = 1;
            // copying contents to new file and inserting record at 3rd position
            while(text != null) {
                if(record == 3){
                    System.out.println("Enter product name:");
                    pout.println(br.readLine());
                    System.out.println("Enter cost:");
                    pout.println(br.readLine());
                } else{
                    pout.println(text);
                    text = bin.readLine();
                    pout.println(text);
                    text = bin.readLine();
                }
                record++;
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

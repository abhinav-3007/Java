// Abhinav Goyal
// 9D
// Program to calculate the Simple Interest with rate of 8 or 12 depending on user inputed time

import java.io.*;

public class Interest_input
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the principal");
        int principal = Integer.parseInt(br.readLine());
        System.out.println("Enter the time");
        int time = Integer.parseInt(br.readLine());
        int rate;
        if(time>2){
            rate = 8;
        }else{
            rate = 12;
        }
        double si = (principal*rate*time)/100;
        System.out.println("The interest is "+si);
    }
}

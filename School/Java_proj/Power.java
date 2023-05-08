// Abhinav Goyal
//9D
//Program to print squre or cube of number depending on whether the number is even or odd

import java.io.*;

public class Power
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());
        int ans;
        if(num%2 == 0){
            ans = num*num;
        }else{
            ans = num*num*num;
        }
        System.out.println("The calculated result is "+ans);
    }
}

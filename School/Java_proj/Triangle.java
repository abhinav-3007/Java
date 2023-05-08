// Abhinav Goyal
//9D
//Program to print whether triangle is equilateral, isosceles or scalene

import java.io.*;

public class Triangle
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the length of sides one by one");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        String type;
        if(a==b && b==c)
            type = "isosceles";
        else if(a!=b && b!=c && a!=c)
            type = "scalene";
        else
            type = "isosceles";
        System.out.println("The triangle is "+type);
    }
}

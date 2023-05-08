// Abhinav Goyal
//9D 30/10/2020
//Program to print first n odd numbers

import java.util.*;

public class OddWhile
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int i=1;
        while(i<=n*2)
        {
            System.out.println(i);
            i+=2;
        }
    }
}
// Abhinav Goyal
//9D 1/9/2020
//Program to print first n odd numbers

import java.util.*;

public class Odd
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i=1; i<=n*2; i+=2)
        {
            System.out.println(i);
        }
    }
}
// Abhinav Goyal
//9D 30/10/2020
//Program to input a number and print its reverse

import java.util.*;

public class ReverseNumWhile
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int rev = 0;
        while(n>0)
        {
            int d = n%10;
            rev = (rev*10) + d;
            n = n/10;
        }
        System.out.println(rev);
    }
}
// Abhinav Goyal
//9D 30/10/2020
//Program to find product of first n even numbers

import java.util.*;

public class ProductWhile
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int ct = 1, ans = 1;
        int i = 2;
        while(ct<=n)
        {
            ans = ans*i;
            ct++;
            i+=2;
        }
        System.out.println(ans);
    }
}
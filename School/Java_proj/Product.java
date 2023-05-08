// Abhinav Goyal
//9D 4/9/2020
//Program to find product of first n even numbers

import java.util.*;

public class Product
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int ct = 1, ans = 1;
        for(int i = 2; ct<=n; ct++,i+=2)
        {
            ans = ans*i;
        }
        System.out.println(ans);
    }
}
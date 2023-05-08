// Abhinav Goyal
//9D 30/10/2020
//Program to find factorial of inputaed number

import java.util.*;

public class FactorialWhile
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ans = 1;
        int i = 1;
        while(i<=n)
        {
            ans = ans*i;
            i++;
        }
        System.out.println(ans);
    }
}
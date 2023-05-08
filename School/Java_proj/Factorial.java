// Abhinav Goyal
//9D 4/9/2020
//Program to find factorial of inputaed number

import java.util.*;

public class Factorial
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ans = 1;
        for(int i = 1; i<=n; i++)
        {
            ans = ans*i;
        }
        System.out.println(ans);
    }
}
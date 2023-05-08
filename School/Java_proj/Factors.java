// Abhinav Goyal
//9D 8/9/2020
//Program to print sum of factors of a number

import java.util.*;

public class Factors
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++)
        {
            if (n%i == 0)
                sum+=i;
        }
        System.out.println(sum);
   }
}
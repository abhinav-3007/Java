// Abhinav Goyal
//9D 30/10/2020
//Program to print sum of factors of a number

import java.util.*;

public class FactorsWhile
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n)
        {
            if (n%i == 0)
                sum+=i;
            i++;
        }
        System.out.println(sum);
   }
}
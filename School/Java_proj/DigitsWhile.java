// Abhinav Goyal
//9D 30/10/2020
//Program to print product of all its digits excluding 0

import java.util.*;

public class DigitsWhile
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ans = 1;
        while(n>0)
        {
            int d = n%10;
            n = n/10;
            if(d!=0)
                ans = ans*d;
        }
        System.out.println("The product is "+ans);
   }
}
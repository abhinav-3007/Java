// Abhinav Goyal
//9D 8/9/2020
//Program to print product of all its digits excluding 0

import java.util.*;

public class Digits
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ans = 1;
        for(;n>0;)
        {
            int d = n%10;
            n = n/10;
            if(d!=0)
                ans = ans*d;
        }
        System.out.println("The product is "+ans);
   }
}
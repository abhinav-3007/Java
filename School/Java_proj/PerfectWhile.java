// Abhinav Goyal
//9D 30/10/2020
//Program to print whether a number is a perfect number

import java.util.*;

public class PerfectWhile
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<n)
        {
            if (n%i == 0)
                sum+=i;
            i++;
        }
        if(sum == n){
            System.out.println("The number is a perfect number");
        }else{
            System.out.println("The number is not a perfect number");
        }
   }
}
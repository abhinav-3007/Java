// Abhinav Goyal
//9D 30/10/2020
//Program to print whether a number is a prime number

import java.util.*;

public class PrimeWhile
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int c = 0;
        int i = 2;
        while(i<n)
        {
            if (n%i == 0)
                c++;
            i++;
        }
        if(c == 0){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
   }
}
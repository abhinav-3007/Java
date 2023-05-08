// Abhinav Goyal
//9D 8/9/2020
//Program to print the sum of a number's even numbered digits and odd numbered digits

import java.util.*;

public class Sum_even
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int se = 0, so = 0;
        for(; n>0;)
        {
            int d  = n%10;
            n = n/10;
            if(d%2 == 0){
                se+=d;
            }else{
                so+=d;
            }
        }
        System.out.println("Sum Even\t"+se);
        System.out.println("Sum Odd \t"+so);
   }
}
// Abhinav Goyal
//9D 8/9/2020
//Program to print whether a number is an armstrong number

import java.util.*;

public class Armstrong_loop
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int x = n, arm = 0;
        for(;n>0;)
        {
            int d = n%10;
            arm = arm+(d*d*d);
            n = n/10;
        }
        if(arm == x){
            System.out.println("The number is armstrong");
        }else{
            System.out.println("The number is not armstrong");
        }
   }
}
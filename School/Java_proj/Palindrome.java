// Abhinav Goyal
//9D 4/9/2020
//Program to print whether a number is palindrome or not

import java.util.*;

public class Palindrome
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rev = 0, copy = n;
        for(;n>0;)
        {
            int d = n%10;
            rev = (rev*10) + d;
            n = n/10;
        }
        if(rev == copy){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }
   }
}
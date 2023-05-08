// Abhinav Goyal
//9D 21/8/2020
//Program to print whether a number is armstrong or not

import java.util.*;

public class Armstrong
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int p = n;
        int a = n%10;
        n = n/10;
        int b = n%10;
        n = n/10;
        int c = n;
        int sum = (a*a*a)+(b*b*b)+(c*c*c);
        if(sum == p){
            System.out.println("The number is armstrong");
        }else{
            System.out.println("The number is not armstrong");
        }
    }
}
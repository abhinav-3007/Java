// Abhinav Goyal
//9D 21/8/2020
//Program to print 3 numbers in ascending order

import java.util.*;

public class Ascending
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the second number");
        int c = sc.nextInt();
        if(a>b && b>c){
            System.out.println(c+"\t"+b+"\t"+a);
        }else if(a>c && c>b){
            System.out.println(b+"\t"+c+"\t"+a);
        }else if(c>b && b>a){
            System.out.println(a+"\t"+b+"\t"+c);
        }else if(b>c && c>a){
            System.out.println(a+"\t"+c+"\t"+b);
        }else if(c>a && a>b){
            System.out.println(b+"\t"+a+"\t"+c);
        }else if(b>a && a>c){
            System.out.println(c+"\t"+a+"\t"+b);
        }else{
            System.out.println("2 or more of the values are equal");
        }
    }
}

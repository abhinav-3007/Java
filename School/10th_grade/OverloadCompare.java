// Abhinav Goyal
// 10 D 8/3/2021
// Program to compare 2 values 

import java.util.*;

public class OverloadCompare
{
    public static void compare(int a, int b)
    {
        if(a>b)
            System.out.println(a);
        else if(b>a)
            System.out.println(b);
        else
            System.out.println("They are equal");
    }
    
    public static void compare(char a, char b)
    {
        if(a>b)
            System.out.println(a);
        else if(b>a)
            System.out.println(b);
        else
            System.out.println("They are the same");
    }
    
    public static void compare(String c, String d)
    {
        if(c.length() > d.length())
            System.out.println(c);
        else if(d.length() > c.length())
            System.out.println(d);
        else
            System.out.println("They have same length");
    }
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the datatype (1.int, 2.char, 3.String)");
        int choice = sc.nextInt();
        System.out.println("Enter the values one by one");
        switch(choice)
        {
            case 1:
            int p = sc.nextInt();
            int q = sc.nextInt();
            compare(p,q);
            break;
            case 2:
            char ch = sc.next().charAt(0);
            char ch1 = sc.next().charAt(0);
            compare(ch,ch1);
            break;
            case 3:
            String s = sc.next();
            String st = sc.next();
            compare(s,st);
            break;
            default:
            System.out.println("Enter a valid choice");
        }
    }
}

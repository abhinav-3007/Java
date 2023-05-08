// Abhinav Goyal
// 10D
// Program to calculate factorial

import java.util.*;

public class Factorial67
{
    int a;
    Factorial67()
    {
        a=0;
    }
    
    Factorial67(int b)
    {
        a=b;
    }
    
    public void input(int m)
    {
        a=m;
    }
    
    public void display()
    {
        int f = 1;
        for(int i=2; i<=a; i++)
            f = f*i;
        System.out.println(f);
    }
    
    public static void main()
    {
        Factorial67 obj = new Factorial67();
        Factorial67 obj2 = new Factorial67(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n = sc.nextInt();
        obj.input(n);
        obj.display();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        obj2.input(n2);
        obj2.display();
    }
}

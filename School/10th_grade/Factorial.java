// Abhinav Goyal
// 10D
// Program to print factorial of a number

import java.util.*;

public class Factorial
{
    int a;
    
    Factorial()
    {
        a = 0;
    }

    public void input(int m)
    {
        a = m;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        Factorial obj = new Factorial();
        obj.input(x);
        obj.display();
    }
}

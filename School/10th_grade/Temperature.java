// Abhinav Goyal
// 10D
// Program to convert temperature to farenheit

import java.util.*;

public class Temperature
{
    double max, min, f1, f2;
    Temperature(int x, int y)
    {
        max = 0;
        min = 0;
        f1 = 0;
        f2 = 0;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum and minumum temperatures");
        max = sc.nextDouble();
        min = sc.nextDouble();
    }
    
    public void compute()
    {
        f1 = ((9*max)/5)+32;
        f2 = ((9*min)/5)+32;
    }
    
    public void display()
    {
        System.out.println(f1);
        System.out.println(f2);
    }
    
    public static void main()
    {
        Temperature obj = new Temperature(10,20);
        obj.input();
        obj.compute();
        obj.display();
    }
}

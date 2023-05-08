// Abhinav Goyal
// 10D
// Program to print employees pay

import java.util.*;

public class Increment
{
    String name;
    double basic;
    int age;
    public void getdata( String n, double b, int a )
    {
        name = n;
        basic = b;
        age = a;
    }
    
    public void calculate()
    {
        double inc;
        if(age>=50)
            inc = basic*(20.0/100.0);
        else if(age>=45)
            inc = basic*(15.0/100.0);
        else
            inc = basic*(10.0/100.0);
        basic+=inc;
    }
    
    public void display()
    {
        System.out.println("Name\tAge\tUpdated Basic");
        System.out.println(name+"\t"+age+"\t"+basic);
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name,basic pay and age");
        String n = sc.nextLine();
        double b = sc.nextDouble();
        int a = sc.nextInt();
        Increment obj = new Increment();
        obj.getdata(n,b,a);
        obj.calculate();
        obj.display();
    }
}
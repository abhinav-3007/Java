// Abhinav Goyal
//10D
// Program to calculate sum of numbers

import java.util.*;

public class Student68
{
    int no1, no2, no3, sum;
    Student68(int a)
    {
        no1 = a;
        no2 = a;
        no3 = a;
        sum = a;
    }
    
    Student68()
    {
        no1 = 0;
        no2 = 0;
        no3 = 0;
        sum = 0;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        no1 = sc.nextInt();
        no2 = sc.nextInt();
        no3 = sc.nextInt();
    }
    
    public void compute()
    {
        sum = no1+no2+no3;
    }
    
    public void display()
    {
        System.out.println(sum);
    }
    
    public static void main()
    {
        Student68 obj = new Student68();
        obj.input();
        obj.compute();
        obj.display();
        Student68 obj2 = new Student68(5);
        obj2.input();
        obj2.compute();
        obj2.display();
    }
}

// Abhinav Goyal
// 10D
// Program to print average and maximum marks

import java.util.*;

public class Student
{
    String name;
    double m1, m2, m3, ma, avg;
    Student(int a, int b)
    {
        name=""; 
        m1=0; 
        m2=0; 
        m3=0; 
        ma=0; 
        avg=0;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and marks of student");
        name = sc.nextLine();
        m1 = sc.nextDouble();
        m2 = sc.nextDouble();
        m3 = sc.nextDouble();
    }
    
    public void compute()
    {
        avg = (m1+m2+m3)/3;
        ma = Math.max(m3,Math.max(m1,m2));
    }
    
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("First mark: "+m1);
        System.out.println("Second mark: "+m2);
        System.out.println("Third mark: "+m3);
        System.out.println("Maximum: "+ma);
        System.out.println("Average: "+avg);
    }
    
    public static void main()
    {
        Student obj = new Student(10,20);
        obj.input();
        obj.compute();
        obj.display();
    }
}

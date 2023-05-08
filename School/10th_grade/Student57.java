// Abhinav Goyal
// 10D
// Program to print students details

import java.util.*;

public class Student57
{
    int rollno;
    String name;
    String standard;
    char section;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll no., name, standard and section");
        rollno = sc.nextInt();
        name = sc.next();
        standard = sc.next();
        section = sc.next().charAt(0);
    }
    
    public void print()
    {
        System.out.println("Roll no.\tName\tStandard\tSection");
        System.out.println(rollno+"\t\t"+name+"\t"+standard+"\t\t"+section);
    }

    public static void main()
    {
        Student57 st = new Student57();
        st.input();
        st.print();
        Student57 st1 = new Student57();
        st1.input();
        st1.print();
        Student57 st2 = new Student57();
        st2.input();
        st2.print();
    }
}

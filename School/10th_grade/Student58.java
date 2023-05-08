// Abhinav Goyal
// 10D
// Program to print students details

import java.util.*;

public class Student58
{
    int rollno;
    String name;
    String standard;
    char section;
    public void input(int roll, String n, String std, char sec)
    {
        rollno = roll;
        name = n;
        standard = std;
        section = sec;
    }
    
    public void print()
    {
        System.out.println("Roll no.\tName\tStandard\tSection");
        System.out.println(rollno+"\t\t"+name+"\t"+standard+"\t\t"+section);
    }

    public static void main()
    {
        Student58 st = new Student58();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll no., name, standard and section");
        int roll = sc.nextInt();
        String n = sc.next();
        String std = sc.next();
        char sec = sc.next().charAt(0);
        st.input(roll, n, std, sec);
        st.print();
    }
}

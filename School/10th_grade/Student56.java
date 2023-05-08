// Abhinav Goyal
// 10D
// Program to print students details

import java.util.*;

public class Student56
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
        System.out.println("Roll no: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Standard: "+standard);
        System.out.println("Section: "+section);
    }

    public static void main()
    {
        Student56 st = new Student56();
        st.input();
        st.print();
    }
}

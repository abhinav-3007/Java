// Abhinav Goyal
// 10  22/2/2021
// Program to print marks and name of students

import java.util.*;

public class MarksArray
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[10];
        int mks[] = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Enter the student's name");
            name[i] = sc.next();
            System.out.println("Enter the student's marks");
            mks[i] = sc.nextInt();
        }
        System.out.println("Name\tMarks");
        for(int i=0; i<10; i++)
            System.out.println(name[i]+"\t"+mks[i]);
    }
}

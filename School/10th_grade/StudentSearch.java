// Abhinav Goyal
// 10  26/2/2021
// Program to find name of student in array

import java.util.*;

public class StudentSearch
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        String a[] = new String[10];
        System.out.println("Enter the names of students one by one");
        for(int i=0; i<a.length; i++)
            a[i] = sc.nextLine();
        System.out.println("Enter the student to be found");
        String name = sc.nextLine();
        
        for(int i=0; i<a.length; i++){
            if(a[i].equals(name)){
                System.out.println("The student is at position "+i);
                flag = 1;
                break;
            }
        }
        
        if(flag==0)
            System.out.println("The student was not in the list");
    }
}
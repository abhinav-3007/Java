// Abhinav Goyal
// 12A
// Class to input name, date of birth, and roll number

import java.util.*;

public class Student
{
    String name, dob, roll;
    
    // method to input details
    public void inputData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter date of birth");
        dob = sc.nextLine();
        System.out.println("Enter roll number");
        roll = sc.nextLine();
    }
    
    // method to display data
    public void printData()
    {
        System.out.println("Name: "+name);
        System.out.println("Date of birth: "+dob);
        System.out.println("Roll number: "+roll);
    }
}
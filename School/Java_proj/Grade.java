// Abhinav Goyal
//9D 18/8/2020
//Program to print grade of a child based on marks

import java.util.*;

public class Grade
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the students marks");
        int m = sc.nextInt();
        String r;
        if(m>90){
            r = "excellent";
        }else if(m>80){
            r = "good";
        }else if(m>70){
            r = "fair";
        }else if(m>60){
            r = "average";
        }else{
            r = "poor";
        }
        System.out.println("Your grade is "+r);
    }
}

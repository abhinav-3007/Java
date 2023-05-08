// Abhinav Goyal
// 10 D 8/3/2021
// Program to calculate percentage and average marks

import java.util.*;

public class School
{
    public static void school(int a, int b, int c)
    {
        double avg = ((a+b+c)*100)/300;
        System.out.println("The percentage is "+avg);
        System.out.println("The average is "+(a+b+c)/3); 
    }
    
    public static void school(int a, int b, int c, int d)
    {
        double avg = ((a+b+c+d)*100)/400;
        System.out.println("The percentage is "+avg);
        System.out.println("The average is "+(a+b+c+d)/4); 
    }
    
    public static void school(int a, int b, int c, int d, int e)
    {
        double avg = ((a+b+c+d+e)*100)/500;
        System.out.println("The percentage is "+avg);
        System.out.println("The average is "+(a+b+c+d+e)/5); 
    }
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the roll no.");
        int roll = sc.nextInt();
        System.out.println("Enter the level (1.primary, 2.middle, 3.high");
        int c  = sc.nextInt();
        int arr[] = new int[2+c];
        System.out.println("Enter the marks one by one");
        for(int i = 0; i<2+c; i++)
            arr[i] = sc.nextInt();
        switch(c)
        {
            case 1:
            school(arr[0], arr[1], arr[2]);
            break;
            case 2:
            school(arr[0], arr[1], arr[2], arr[3]);
            break;
            case 3:
            school(arr[0], arr[1], arr[2], arr[3], arr[4]);
            break;
            default:
            System.out.println("Enter a valid choice");
        }
    }
}

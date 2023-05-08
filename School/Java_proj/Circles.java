// Abhinav Goyal
//9D 28/8/2020
//Program to print either area or perimeter of a circle

import java.util.*;

public class Circles
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("The choices are:\n"+
                           "1) Area of a circle\n"+
                           "2) Perimeter of a circle");
        System.out.println("Please enter your choice(1 or 2)");
        int choice = sc.nextInt();
        System.out.println("Please enter the radius");
        int r = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("The answer is "+(3.14*r*r));
            break;
            case 2:
            System.out.println("The answer is "+(2*3.14*r));
            break;
            default:
            System.out.println("Please enter a valid choice");
        }
    }
}
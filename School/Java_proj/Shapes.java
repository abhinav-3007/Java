// Abhinav Goyal
//9D 28/8/2020
//Program to print area of either circle, rectangle or triangle

import java.util.*;

public class Shapes
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("The choices are:\n"+
                           "1) Area of a circle\n"+
                           "2) Area of a rectangle\n"+
                           "3) Area of a triangle");
        System.out.println("Please enter your choice(1, 2 or 3)");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter the radius");
            int r = sc.nextInt();
            System.out.println("The answer is "+(3.14*r*r));
            break;
            case 2:
            System.out.println("Enter the length");
            int l = sc.nextInt();
            System.out.println("Enter the breadth");
            int b = sc.nextInt();
            System.out.println("The answer is "+(l*b));
            break;
            case 3:
            System.out.println("Enter the base");
            int base = sc.nextInt();
            System.out.println("Enter the height");
            int h = sc.nextInt();
            System.out.println("The answer is "+(0.5*base*h));
            break;
            default:
            System.out.println("Please enter a valid choice");
        }
    }
}
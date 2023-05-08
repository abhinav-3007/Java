// Abhinav Goyal
// 10 D 8/3/2021
// Program to calculate volumes of 3d shapes

import java.util.*;

public class Overload
{
    public static void volume(int a){
        int vol = a*a*a;
        System.out.println("The volume is "+vol);
    }
    
    public static void volume(double r){
        double vol = (4/3)*3.14*r*r*r;
        System.out.println("The volume is "+vol);
    }
    
    public static void volume(double l, double b, double h){
        double vol = l*b*h;
        System.out.println("The volume is "+vol);
    }
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choidce (1.cube, 2.sphere, 3.rectangle)");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter the length of side");
            int s = sc.nextInt();
            volume(s);
            break;
            case 2:
            System.out.println("Enter the radius");
            double rad = sc.nextDouble();
            volume(rad);
            break;
            case 3:
            System.out.println("Enter the length, breadth and height, one by one");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            volume(x,y,z);
            break;
            default:
            System.out.println("Enter a valid choice");
        }
    }
}

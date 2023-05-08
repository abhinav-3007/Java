// Abhinav Goyal
// 10  5/3/2021
// Program to operate on 2 numbers

import java.util.*;

public class Calculate
{
    public static void menu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers one by one");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter your choice(1.add, 2.subtract, 3.multiply, 4.divide)");
        int c = sc.nextInt();
        switch(c){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            default:
            System.out.println("Enter a valid choice");
        }
    }
    
    public static void main()
    {
        menu();
    }
}
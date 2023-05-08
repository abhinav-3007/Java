// Abhinav Goyal
// 10  5/3/2021
// Program to operate on 2 numbers

import java.util.*;

public class ReturnCalc
{
    public static double menu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers one by one");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter your choice(1.add, 2.subtract, 3. multiply, 4.divide)");
        int c = sc.nextInt();
        switch(c){
            case 1:
            return(a+b);
            case 2:
            return(a-b);
            case 3:
            return(a*b);
            case 4:
            return(a/b);
            default:
            System.out.println("Enter a valid choice");
            System.exit(0);
        }
        return 0.0;
    }
    
    public static void main()
    {
        double ans = menu();
        System.out.println(ans);
    }
}

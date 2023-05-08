// Abhinav Goyal
// 10 D 8/3/2021
// Program to operate on 2 numbers

import java.util.*;

public class Oper
{
    public static double calc(double a, double b, int c){
        double ans = 0, check = 0;
        switch(c)
        {
            case 1:
            ans = a+b;
            break;
            case 2:
            ans = a-b;
            break;
            case 3:
            ans = a*b;
            break;
            case 4:
            ans = a/b;
            break;
        }
        return ans;
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers one by one");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Choices:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        int oper = sc.nextInt();
        double res = calc(x,y,oper);
        System.out.println(res);
    }
}


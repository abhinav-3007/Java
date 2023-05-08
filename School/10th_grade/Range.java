// Abhinav Goyal
// 10 D 8/3/2021
// Program to print sum of numbers in a range

import java.util.*;

public class Range
{
    public static int calc(int a, int b)
    {
        int sum = 0;
        for(int i = a; i<= b; i++)
            sum += i;
        return sum;
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers one by one");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        if(x<y)
            ans = calc(x,y);
        else
            ans = calc(y,x);
        System.out.println(ans);
    }
}

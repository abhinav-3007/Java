// Abhinav Goyal
// 10  19/2/2021
// Program to calculate sum of corresponding cells from 2 arrays

import java.util.*;

public class ArraysSum
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int sum[] = new int[10];
        int i;
        System.out.println("Enter the values of first array one by one");
        for(i=0; i<10; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the values of second array one by one");
        for(i=0; i<10; i++)
            b[i] = sc.nextInt();
        for(i=0; i<10; i++)
            sum[i] = a[i]+b[i];
        for(i=0; i<10; i++)
            System.out.println(sum[i]);
    }
}

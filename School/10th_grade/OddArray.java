// Abhinav Goyal
// 10  15/2/2021
// Program to print values with odd subscripts

import java.util.*;

public class OddArray
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter the numbers one by one");
        for(int i=0; i<10; i++)
            a[i] = sc.nextInt();
        for(int i=1; i<10; i+=2)
            System.out.println(a[i]);
    }
}

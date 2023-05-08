// Abhinav Goyal
// 10  15/2/2021
// Program to print elements of an array in reverse order

import java.util.*;

public class ReverseArray
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter the values one by one");
        for(int i=0; i<10; i++)
            a[i] = sc.nextInt();
        for(int i=9; i>=0; i--){
            System.out.println(a[i]);
        }
    }
}

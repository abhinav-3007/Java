// Abhinav Goyal
// 10  19/2/2021
// Program to print even mumbers from an array

import java.util.*;

public class EvenArray
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        System.out.println("Enter the numbers one by one");
        for(int i=0; i<20; i++)
            a[i] = sc.nextInt();
        for(int i=0; i<20; i++){
            if(a[i]%2 == 0)
                System.out.println(a[i]);
        }
    }
}

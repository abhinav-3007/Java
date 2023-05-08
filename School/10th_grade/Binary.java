// Abhinav Goyal
// 10D 3/6/2021
// Program to find a value using binary search

import java.util.*;

public class Binary
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        int a[] = new int[10];
        for(int i = 0; i<10; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the value to find");
        int key = sc.nextInt();
        int mid = 0, low = 0, high = 9, flag = 0;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(a[mid]<key)
                low = mid+1;
            else if(a[mid]>key)
                high = mid-1;
            else{
                System.out.println("The value is at "+mid);
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("Search unsuccessful");
    }
}

// Abhinav Goyal
// 10D
// Program to search for element with binary search

import java.util.*;

public class TestSearch
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the value to find");
        int key = sc.nextInt();
        int l = 0, u = 9, mid = 0, flag = 0;
        while(l<=u){
            mid = (l+u)/2;
            if(arr[mid] == key){
                flag = 1;
                System.out.println("Value is at index "+mid);
                break;
            }else if(arr[mid]<key)
                l = mid+1;
            else
                u = mid-1;
        }
        if(flag == 0)
            System.out.println("Value not found");
    }
}

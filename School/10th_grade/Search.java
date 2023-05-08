// Abhinav Goyal
// 10  26/2/2021
// Program to find value in given array

import java.util.*;

public class Search
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required value");
        int n = sc.nextInt();
        int a[] = {6,2,3,4,1,7,8,5};
        int flag = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == n){
                System.out.println("The value is at position "+i);
                flag = 1;
                break;
            }
        }
        if(flag==0)
            System.out.println("The value was not found");
    }
}

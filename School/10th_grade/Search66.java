// Abhinav Goyal
// 10D
// Program to print average marks

import java.util.*;

public class Search66
{
    int arr[] = new int[10];
    int i,j,temp,k;
    public void inputdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sorted array");
        for(int x=0; x<10; x++)
            arr[x] = sc.nextInt();
        System.out.println("Enter the value to find");
        k = sc.nextInt();
    }
    
    public void bsearch()
    {
        temp=0;
        i=0;
        j=9;
        int mid;
        while(i<=j)
        {
            mid = (i+j)/2;
            if(arr[mid]<k){
                i = mid+1;
            }else if(arr[mid]>k){
                j = mid-1;
            }else{
                System.out.println("The value is at "+mid);
                temp = 1;
                break;
            }
        }
        if(temp == 0)
            System.out.println("Search unsuccessful");
    }
    
    public static void main()
    {
        Search66 obj = new Search66();
        obj.inputdata();
        obj.bsearch();
    }
}

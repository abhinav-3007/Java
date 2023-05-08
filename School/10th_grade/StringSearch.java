// Abhinav Goyal
// 10D 10/6/2021
//Program to search for a string
import java.util.*;

public class StringSearch
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings");
        String arr[] = new String[5];
        for(int i = 0; i<5; i++)
            arr[i] = sc.nextLine();
        System.out.println("Enter the search value");
        String key = sc.nextLine();
        int low = 0, high = 4, mid = 0, flag=0;
        while(low<=high){
            mid = (low+high)/2;
            if(key.compareTo(arr[mid])<0)
                high = mid-1;
            else if(key.compareTo(arr[mid])>0)
                low = mid+1;
            else{
                flag=1;
                System.out.println("The position is "+ (mid+1));
                break;
            }
        }
        if(flag==0)
            System.out.println("Search unsuccessful");
    }
}

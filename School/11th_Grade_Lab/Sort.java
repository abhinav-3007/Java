// Abhinav Goyal
// 11A
// Program to sore array and search using binary search

import java.util.*;
 
public class Sort
{
    int[] arr;
    int item;
    // Constructor
    public Sort()
    {
        arr = new int[50];
        int item = 0;
    }
    
    // method to input array
    public void inpdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        // loop to input array elements
        for(int index = 0; index < 50; index++)
            arr[index] = sc.nextInt();
    }
    
    // method to perform bubble sort
    public void bubsort()
    {
        // bubble sort
        for(int index = 0; index < 50; index++){
            for(int inner = 0; inner < 49-index; inner++){
                if(arr[inner] > arr[inner+1]){
                    int temp = arr[inner];
                    arr[inner] = arr[inner+1];
                    arr[inner+1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int index = 0; index < 50; index++)
            System.out.println(arr[index]);
    }
    
    // method to input search element and perform binary search
    public void binsearch()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter search item");
        item = sc.nextInt();
        // binary search
        int l = 0, u = 49, mid = 0, flag = 0;
        while(l <= u){
            mid = (l+u)/2;
            if(arr[mid] == item){
                System.out.println(item+" is at: "+(mid+1));
                flag = 1;
                break;
            }else if(arr[mid] < item)
                l = mid+1;
            else
                u = mid-1;
        }
        // checking if value was found
        if(flag == 0)
            System.out.println("Value not found");
    }
    
    // main method
    public static void main(String[] args)
    {
        Sort object = new Sort();
        object.inpdata();
        object.bubsort();
        object.binsearch();
    }
}

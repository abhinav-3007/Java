// 25/02/2022
// Program to swap lowest and highest values in an array

import java.util.*;

public class Swap
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 values");
        int arr[] = new int[10];
        int i;
        for(i = 0; i<10; i++)
            arr[i] = sc.nextInt();
        
        int min = arr[0];
        int max = arr[0];
        for(i = 1; i<10; i++){
            if(arr[i] < arr[min])
                min = i;
            if(arr[i] > arr[max])
                max = i;
        }
        
        int temp = arr[min];
        arr[min] = arr[max];
        arr[max] = temp;
        System.out.println("The new array is:");
        for(i = 0; i<10; i++)
            System.out.println(arr[i]);
    }
}

// Abhinav Goyal
// 10  1/3/2021
// Program to sort marks of students in descending order

import java.util.*;

public class MarkSort
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[7];
        System.out.println("Enter the marks one by one");
        for(int i=0; i<7; i++)
            a[i] = sc.nextInt();
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-i-1; j++){
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i=0; i<7; i++)
            System.out.println(a[i]);
    }
}

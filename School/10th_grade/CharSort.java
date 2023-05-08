// Abhinav Goyal
// 10  1/3/2021
// Program to sort characters in ascending order

import java.util.*;

public class CharSort
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char a[] = new char[10];
        System.out.println("Enter the single characters one by one");
        for(int i=0; i<10; i++)
            a[i] = sc.next().charAt(0);
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9-i; j++){
                if(a[j]>a[j+1]){
                    char temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
        for(int i=0; i<10; i++)
            System.out.println(a[i]);
    }
}

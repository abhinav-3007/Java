// Abhinav Goyal
// 11A
// Program to insert and delete array elements

import java.util.*;

public class Rearrange
{
    int[] A;
    int N, pos1, pos2, item;
    
    // Constructor
    public Rearrange()
    {
        A = new int[0];
        N = 0;
        pos1 = 0;
        pos2 = 0;
        item = 0;
    }
    
    // method to enter array and print it
    public void enter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        N = sc.nextInt();
        A = new int[N+1];
        System.out.println("Enter array elements");
        // loop to input elements from user
        for(int index = 0; index < N; index++)
            A[index] = sc.nextInt();
        System.out.println("Size: "+N);
        System.out.println("Array Elements:");
        // loop to print array elemetns
        for(int index = 0; index < N; index++)
            System.out.println(A[index]);
    }
    
    // method to insert array element
    public void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element and position of insertion");
        item = sc.nextInt();
        pos1 = sc.nextInt();
        // loop to insert given element into array
        for(int index = N; index >= pos1-1; index--){
            if(index == pos1-1)
                A[index] = item;
            else
                A[index] = A[index-1];
        }
        disp1();
    }
    
    // method to remove array element
    public void remov()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of deletion");
        pos2 = sc.nextInt();
        // loop to remove given element from array
        for(int index = pos2; index <= N; index++)
            A[index-1] = A[index];
        disp2();
    }
    
    // method to print array after adding element
    public void disp1()
    {
        System.out.println("Array with value added");
        for(int index = 0; index < N+1; index++)
            System.out.println(A[index]);
    }
    
    // method to print array after removing element
    public void disp2()
    {
        System.out.println("Array with value removed:");
        for(int index = 0; index < N; index++)
            System.out.println(A[index]);
    }
    
    // main method
    public static void main(String[] args)
    {
        Rearrange object = new Rearrange();
        object.enter();
        object.insert();
        object.remov();
    }
}

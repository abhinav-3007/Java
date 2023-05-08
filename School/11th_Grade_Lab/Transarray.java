// Abhinav Goyal
// 11A
// Program to find transpose of array

import java.util.*;

public class Transarray
{
    int[][] arr;
    int m, n;
    
    // default construcor
    public Transarray()
    {
        arr = new int[0][0];
        m = 0;
        n = 0;
    }
    
    // parameterized constructor
    public Transarray(int mm, int nn)
    {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }
    
    // method to input array
    public void fillArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[m][n];
        System.out.println("Array Elements:");
        // entering array elements
        for(int index = 0; index < m; index++){
            System.out.println("Row "+(index+1));
            for(int inner = 0; inner < n; inner++)
                arr[index][inner] = sc.nextInt();
        }
    }
    
    // method to find transpose of array
    public void transpose(Transarray A)
    {
        int temp = A.m;
        A.m = A.n;
        A.n = temp;
        int[][] transpose = new int[A.m][A.n];
        // loop to copy array elements in order to create transpose array
        for(int index = 0; index < A.m; index++){
            for(int inner = 0; inner < A.n; inner++)
                transpose[index][inner] = A.arr[inner][index];
        }
        A.arr = transpose.clone();
    }
    
    // method to display the array in matrix format
    public void disparray()
    {
        // loop printing array
        for(int index = 0; index < m; index++){
            for(int inner = 0; inner < n; inner++)
                System.out.print(arr[index][inner] + "\t");
            System.out.println();
        }
    }
    
    // main method
    public static void main(String[] args)
    {
        Transarray object = new Transarray(5,5);
        object.fillArray();
        System.out.println("Array:");
        object.disparray();
        object.transpose(object);
        System.out.println("Transposed Array:");
        object.disparray();
    }
}
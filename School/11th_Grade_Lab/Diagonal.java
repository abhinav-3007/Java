// Abhinav Goyal
// 11A
// Program to print diagonals of a 2 dimensional array

import java.util.*;

public class Diagonal
{
    int m;
    int n;
    int array[][];
    
    public Diagonal()
    {
        m = 0;
        n = 0;
        array = new int[0][0];
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        m = sc.nextInt();
        n = sc.nextInt();
        array = new int[m][n];
        System.out.println("Enter array elements");
        // loop to take input of array elements
        for(int row = 0; row < m; row++) {
            for(int column = 0; column < n; column++)
                array[row][column] = sc.nextInt();
        }
    }
    
    public void diagonalPrint()
    {
        // loop to find and print diagonal elements
        for(int row = 0; row < m; row++) {
            for(int column = 0; column < n; column++) {
                if(row == column || row == (m-1-column))
                    System.out.print(array[row][column] + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
    
    public static void main()
    {
        Diagonal object = new Diagonal();
        object.input();
        object.diagonalPrint();
    }
}

// Abhinav Goyal
//10D
// Program to print sum of diagonals

import java.util.*;

public class Diagonal
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the numbers");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                arr[i][j] = sc.nextInt();
        }
        int lsum=0, rsum=0;
        for(int i=0; i<n; i++){
            lsum+=arr[i][i];
            rsum+=arr[i][m-i-1];
        }
        System.out.println("Sum of diagonals is:");
        System.out.println(lsum+" and "+rsum);
    }
}

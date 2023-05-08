// Abhinav Goyal
//10D
// Program to print sum of rows and columns

import java.util.*;

public class RowSum
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
        System.out.println("Sum of rows is:");
        for(int i=0; i<n; i++){
            int rowsum=0;
            for(int j=0; j<m; j++)
                rowsum+=arr[i][j];
            System.out.println(rowsum);
        }
        System.out.println("Sum of columns is:");
        for(int i=0; i<m; i++){
            int colsum=0;
            for(int j=0; j<n; j++)
                colsum+=arr[j][i];
            System.out.println(colsum);
        }
    }
}

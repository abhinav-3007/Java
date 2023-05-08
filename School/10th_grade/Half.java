// Abhinav Goyal
// 10D
// Program to print grade of student

import java.util.*;

public class Half
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the values");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m;j++)
                arr[i][j] = sc.nextInt();
        }
        
        int num = m;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<num; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
            num--;
        }
    }
}

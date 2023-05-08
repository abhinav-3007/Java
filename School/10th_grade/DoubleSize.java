import java.util.*;

public class DoubleSize
{
    public static void main(){
        System.out.println("Enter the rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the columns");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the numbers");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                arr[i][j] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
}

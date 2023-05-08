import java.util.*;

public class DoubleEven
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter the numbers");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++)
                arr[i][j] = sc.nextInt();
        }
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(arr[i][j]%2 == 0)
                    System.out.print(arr[i][j]+"\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}

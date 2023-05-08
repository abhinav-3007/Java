// Abhinav Goyal
// 10D
// Program to print city with highest and lowest temperature

import java.util.*;

public class Temp
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cities and their highest and lowest temperatures");
        String city[] = new String[5];
        int temp[][] = new int[2][5];
        for(int i=0; i<5; i++){
            city[i] = sc.next();
            temp[0][i] = sc.nextInt();
            temp[1][i] = sc.nextInt();
        }
        int high=0, low=0;
        for(int i=0; i<5; i++){
            if(temp[0][i] > temp[0][high])
                high=i;
            if(temp[1][i]<temp[1][low])
                low=i;
        }
        System.out.println("Highest temperature is in "+city[high]);
        System.out.println("Lowest temperature is in "+city[low]);
    }
}

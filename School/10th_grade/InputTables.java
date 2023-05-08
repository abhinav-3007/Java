// Abhinav Goyal
// 10 D 8/3/2021
// Program to print tables of n

import java.util.*;

public class InputTables
{
    public static void table(int n)
    {
        for(int i = 0; i <= 10; i++)
            System.out.println(n*i);
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        table(y);
    }
}

// Abhinav Goyal
// 10 D 8/3/2021
// Program to check if condition is satisfied

import java.util.*;

public class Condition
{
    public static int satis(int a, int b, int c, int d){
        double res = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
        if(res == Math.pow(d,3))
            return 0;
        else
            return -1;
    }
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enther the numbers one by one");
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int ans = satis(w,x,y,z);
        System.out.println(ans);
    }
}

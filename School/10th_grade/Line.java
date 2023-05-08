// Abhinav Goyal
// 10 D 8/3/2021
// Program to print a horizontal line

import java.util.*;

public class Line
{
    public static void hline(){
        for(int i = 0; i<30; i++)
            System.out.print("-");
    }
    
    public static void hline(int n){
        for(int i = 0; i<n; i++)
            System.out.print("*");
    }
    
    public static void hline(int n, char c){
        for(int i = 0; i<n; i++)
            System.out.print(c);
    }
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter what features to specify(1.None, 2.length, 3.length and character)");
        int c = sc.nextInt();
        switch(c)
        {
            case 1:
            hline();
            break;
            case 2:
            System.out.println("Enter the length");
            int len = sc.nextInt();
            hline(len);
            break;
            case 3:
            System.out.println("Enter the length");
            int l = sc.nextInt();
            System.out.println("Enter the character");
            char ch = sc.next().charAt(0);
            hline(l,ch);
            break;
            default:
            System.out.println("Enter a valid choice");
        }
    }
}

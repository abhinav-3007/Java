import java.util.*;

// Abhinav Goyal
// 9D
// Program to print whether a given figure is a square or rectangle based on inputted length and breadth

public class Quad
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
        String quad = length==breadth? "square":"rectangle";
        System.out.println("The figure is a "+ quad);
    }
}

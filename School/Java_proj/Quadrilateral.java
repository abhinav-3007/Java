// Abhinav Goyal
// 9D
// Program to print whether a given figure is a square or rectangle

public class Quadrilateral
{
    public static void main()
    {
        int length = 10;
        int breadth = 10;
        String quad = length==breadth? "square":"rectangle";
        System.out.println("The figure is a "+ quad);
    }
}

// Abhinav Goyal
// 11A
// Program to identify shape with inputted length

import java.util.*;

public class ShapeInput
{
    int length;
    int breadth;
    // Constructor method
    public ShapeInput(int inputLength, int inputBreadth)
    {
        length = inputLength;
        breadth = inputBreadth;
    }
    
    // function to identify shape
    public void identifyShape()
    {
        if(length == breadth)
            System.out.println("It is a square");
        else
            System.out.println("It is a rectangle");
    }
    
    // main function
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        ShapeInput object =  new ShapeInput(length, breadth);
        object.identifyShape();
    }
}

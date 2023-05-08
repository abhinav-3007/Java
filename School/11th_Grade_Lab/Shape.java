// Abhinav Goyal
// 11 A
// Program to identify whether the shape is a square or rectangle

public class Shape
{
    int length;
    int breadth;
    // Constructor method
    public Shape()
    {
        length = 5;
        breadth = 3;
    }
    
    // Function to identify the shape
    public void identifyShape()
    {
        if(length == breadth)
            System.out.println("It is a square");
        else
            System.out.println("It is a rectangle");
    }
    
    // main method
    public static void main()
    {
        Shape object = new Shape();
        object.identifyShape();
    }
}

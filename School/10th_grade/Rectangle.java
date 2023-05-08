// Abhinav Goyal
// 10D
// Program to print area, perimeter and diagonal of rectangle

import java.util.*;

public class Rectangle
{
    int length, breadth, perimeter, area;
    float diagonal;
    public void inputdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        length = sc.nextInt();
        breadth = sc.nextInt();
    }
    
    public void calculate()
    {
        area = length*breadth;
        perimeter = 2*(length+breadth);
        diagonal = (float)Math.sqrt((length*length)+(breadth*breadth));
    }
    
    public void outputdata()
    {
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Diagonal: "+diagonal);
    }
    public static void main()
    {
        Rectangle r = new Rectangle();
        r.inputdata();
        r.calculate();
        r.outputdata();
    }
}

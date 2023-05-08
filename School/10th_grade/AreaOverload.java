// Abhinav Goyal
// 10 D 8/3/2021
// Program to find area of shapes

import java.io.*;

public class AreaOverload
{
    public static int area(int s)
    {
        return s*s;
    }
    
    public static int area(int l, int b)
    {
        return l*b;
    }
    
    public static double area(double r)
    {
        return 3.14*r*r;
    }
    
    public static double area(double a, double b, double c)
    {
        double s = 0.5*(a+b+c);
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
    public static void main() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter your choice (1.square, 2.rectangle. 3.circle, 4.triangle)");
        int c = Integer.parseInt(br.readLine());
        double ans;
        System.out.println("Enter the values");
        switch(c)
        {
            case 1:
            int side = Integer.parseInt(br.readLine());
            ans = area(side);
            System.out.println(ans);
            break;
            case 2:
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            ans = area(x,y);
            System.out.println(ans);
            break;
            case 3:
            double rad = Double.parseDouble(br.readLine());
            ans = area(rad);
            System.out.println(ans);
            break;
            case 4:
            double d = Double.parseDouble(br.readLine());
            double e = Double.parseDouble(br.readLine());
            double f = Double.parseDouble(br.readLine());
            ans = area(d,e,f);
            System.out.println(ans);
            break;
            default:
            System.out.println("Enter a valid choice");
        }
    }
}

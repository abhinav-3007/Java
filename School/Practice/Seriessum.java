// Abhinav Goyal
// 11A
// Program to calculate sum of given series

import java.util.*;

public class Seriessum
{
    int n,x;
    double sum;
    // Constructor
    public Seriessum()
    {
        n = 0;
        x = 0;
        sum = 1.0;
    }
    
    // method to find factorial
    public static int factorial(int n)
    {
        int fact = 1;
        // loop to calculate factorial
        for(int numbers = 1; numbers <= n; numbers++)
            fact*=numbers;
        return fact;
    }
    
    // method to find each term of series
    public static double term(int p, int n)
    {
        double denominator = factorial(n);
        double numerator = Math.pow(p, (2*n)-1);
        return (numerator/denominator);
    }
    
    // method to accept values of n and x
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of n and x");
        n = sc.nextInt();
        x = sc.nextInt();
    }
    
    // method to display result
    public void displaysum()
    {
        System.out.println(calsum());
    }
    
    // method to calculate sum of series
    public double calsum()
    {
        // loop to calculate sum of series
        for(int seriesterm = 1; seriesterm <= n; seriesterm++){
            sum += term(x, seriesterm);
        }
        return sum;
    }
    
    // main method
    public static void main()
    {
        Seriessum object = new Seriessum();
        object.accept();
        object.displaysum();
    }
}

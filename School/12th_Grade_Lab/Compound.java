// Abhinav Goyal
// 12A
// Class to calculate compound interest

import java.util.*;

public class Compound extends Account
{
    double rate;
    double time;
    
    // Parameterized constructor
    public Compound(int account, double principal, double rateInput, double timeInput)
    {
        super(account, principal);
        rate = rateInput;
        time = timeInput;
    }

    // method to display instance variables and interest
    public void display()
    {
        super.display();
        System.out.println("Rate = "+rate);
        System.out.println("Time = "+time);
        System.out.println("Interest = "+interest());
    }
    
    // method to calculate compound interest
    public double interest()
    {
        double result = principal * Math.pow((1+(rate/100)), time) - principal;
        return result;
    }
    
    // main method
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        int account = sc.nextInt();
        System.out.println("Enter Principal Amount:");
        double principal = sc.nextInt();
        System.out.println("Enter Rate of Interest per Annum:");
        double rate = sc.nextInt();
        System.out.println("Enter Time in Years:");
        double time = sc.nextInt();
        Compound object = new Compound(account, principal, rate, time);
        object.display();
    }
}

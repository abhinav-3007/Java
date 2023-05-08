// Abhinav Goyal
// 12A
// Class to calculate simple interest

import java.util.*;

public class Simple extends Account
{
    double rate;
    double time;
    
    // Parameterized constructor
    public Simple(int account, double principal, double rateInput, double timeInput)
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
    
    // method to calculate simple interest
    public double interest()
    {
        double result = (principal*rate*time)/100;
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
        Simple object = new Simple(account, principal, rate, time);
        object.display();
    }
}

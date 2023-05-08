// Abhinav Goyal
// 11A
// Program to calculate telephone bill

import java.util.*;

public class TelCall
{
    int phno;
    String name;
    int no;
    double amt;
    
    // Parameterised Constructor
    public TelCall(int phone, String user, int calls)
    {
        phno = phone;
        name = user;
        no = calls;
        amt = 0;
    }
    
    // Method to calculate phone bill
    public void compute()
    {
        int callno = no;
        // while loop to calculate bill amount
        while(callno>0){
            // if statement to check which slab number of calls belongs to 
            if(callno<=100){
                amt += 500;
                callno = 0;
            }else if(callno<=200){
                amt += (callno-100)*1;
                callno = 100;
            }else if(callno<=300){
                amt += (callno-200)*1.2;
                callno = 200;
            }else{
                amt += (callno-300)*1.5;
                callno = 300;
            }
        }
    }
    
    // Method to display user details and final calculated phone bill
    public void dispdata()
    {
        System.out.println("Phone\tName\tTotal Calls\tAmount");
        System.out.println(phno+"\t"+name+"\t"+no+"\t"+amt);
    }
    
    // main method to create object and call member functions
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, phone number, and number of calls");
        String userName = sc.nextLine();
        int phoneno = sc.nextInt();
        int count = sc.nextInt();
        TelCall object = new TelCall(phoneno, userName, count);
        object.compute();
        object.dispdata();
    }
}

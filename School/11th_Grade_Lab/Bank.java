// Abhinav Goyal
// 11A
// Program to create bank

import java.util.*;

public class Bank
{
    String name, accountType;
    long accNumber, amount;
    
    // Constructor
    public Bank()
    {
        name = "";
        accountType = "";
        accNumber = 0;
        amount = 0;
    }
    
    // method to create account and set initial values
    public void createAccount()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter the type of account:");
        accountType = sc.nextLine();
        System.out.println("Enter the account number:");
        accNumber = sc.nextLong();
        System.out.println("Enter the account balance:");
        amount = sc.nextLong();
    }
    
    // method to deposit to account
    public void deposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit:");
        long deposit = sc.nextLong();
        amount += deposit;
        System.out.println("Successfully Deposited");
    }
    
    // method to withdraw from account
    public void withdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw:");
        long withdraw = sc.nextLong();
        if(amount < withdraw)
            System.out.println("Insufficient Balance");
        else{
            System.out.println("Successfully Withdrawn");
            amount -= withdraw;
        }
    }
    
    // method to display user balance
    public void dispBalance()
    {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Balance: " + amount);
    }
    
    // main method
    public static void main(String[] args)
    {
        Bank obj = new Bank();
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        // main loop
        while(running){
            System.out.println("Which action to perform:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Balance");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            // checking which option was chosen
            switch(choice){
                case 1:
                obj.createAccount();
                break;
                case 2:
                obj.deposit();
                break;
                case 3:
                obj.withdraw();
                break;
                case 4:
                obj.dispBalance();
                break;
                case 5:
                running = false;
                break;
                default:
                System.out.println("Invalid Choice");
            }
        }
    }
}

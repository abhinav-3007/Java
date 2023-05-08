// Abhinav Goyal
// 12A
// Class to create account

public class Account
{
    protected int accountNumber;
    protected double principal;
    
    // Parameterized constructor
    public Account(int account, double principalInput)
    {
        accountNumber = account;
        principal = principalInput;
    }
    
    // method to display values of instance variables
    public void display() {
        System.out.println("Account number = "+accountNumber);
        System.out.println("Principal = "+principal);
    }
}

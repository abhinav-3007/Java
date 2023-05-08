// Abhinav Goyal 
// 12A
// Subclass to calculate fine and amount to be paid
 
import java.util.*;
 
public class Compute extends Library
{
    int D;
    
    // Parameterized constructor
    public Compute(String nameInput, String authorInput, double pInput, int days) {
        super(nameInput, authorInput, pInput);
        D = days;
    }
    
    // Method to calculate fine
    public void fine() {
        double amount = 0;
        double fine = 0;
        amount = 0.02 * p * D;
        if(D>10)
            fine = 5.75*(D-10);
        amount += fine;
        System.out.println("Fine: "+fine);
        System.out.println("Total Amount: "+amount);
    }
    
    // method to display details
    public void display() {
        show();
        System.out.println("No of days: "+D);
        fine();
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of book:");
        String name = sc.nextLine();
        System.out.println("Name of author:");
        String author = sc.nextLine();
        System.out.println("Price of book:");
        double price = sc.nextDouble();
        System.out.println("Days taken to return:");
        int returnDays = sc.nextInt();
        Compute object = new Compute(name, author, price, returnDays);
        object.display();
    }
}

// Abhinav Goyal
// 11A
// Program to check if number is an emirp number

import java.util.*;

public class Emirp
{
    int N;
    int rev;
    int f;
    
    // Parameterized COnstructor
    public Emirp(int nn)
    {
        N = nn;
        rev = 0;
        f = 2;
    }
    
    // Method to chekc if a number is prime
    public int isprime(int x)
    {
        int factors = 0;
        
        // For loop to look for factors
        for(f = 2; f<x; f++){
            // Condition to check if f is a factor
            if(x%f == 0)
                factors++;
        }
        
        int returnValue = 0;
        // Condition to check if f the given number is prime
        if(factors == 0)
            returnValue = 1;
        return returnValue;
    }
    
    // Method to check if the given number is an emirp number
    public void isEmirp()
    {
        // While loop to reverse number
        int temp = N;
        while(temp>0){
            rev = (rev*10)+(temp%10);
            temp/=10;
        }
        
        int prime = isprime(N);
        int revPrime = isprime(rev);
        // Condition to check if both the number and reverse of number are prime
        if(prime == 1 && revPrime == 1)
            System.out.println("The number is an Emirp number");
        else
            System.out.println("The number is not an Emirp number");
    }
    
    // main method to create object and call method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        Emirp object  = new Emirp(number);
        object.isEmirp();
    }
}

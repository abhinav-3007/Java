// Abhinav Goyal
// 11A
// Program to find twin primes and calculate Brun's constant

import java.util.*;

public class Primes
{
    // method to check if a number is a prime number
    public boolean IsPrime(int n)
    {
        int factors = 0;
        // loop to find number of factors of number
        for(int divisor = 1; divisor <= n; divisor++){
            if(n%divisor == 0)
                factors++;
        }
        boolean returnVal = false;
        if(factors == 2)
            returnVal = true;
        return returnVal;
    }
    
    // method to print twin primes till given number
    public void twinPrimes(int lim)
    {
        int twin;
        // loop to find and print twin primes
        for(twin = 3; twin <= lim; twin += 2){
            if(IsPrime(twin) && IsPrime(twin-2))
                System.out.println("(" + (twin-2) + ", " + (twin) + ")");
        }
    }
    
    // method to find Brun's constant
    public double BrunConstant(int lim)
    {
        int twin;
        double brun = 0;
        // loop to find twin primes and find Brun's constant
        for(twin = 3; twin <= lim; twin += 2){
            if(IsPrime(twin) && IsPrime(twin-2))
                brun += (1.0/twin) + (1.0/(twin-2));
        }
        return brun;
    }
    
    // main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = sc.nextInt();
        Primes object = new Primes();
        object.twinPrimes(limit);
        double brunRes = object.BrunConstant(limit);
        System.out.println("Brun's constant below limit "+limit+" is: "+brunRes);
    }
}


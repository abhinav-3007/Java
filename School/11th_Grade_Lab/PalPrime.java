// Abhinav Goyal
// 11A
// Program to generate palprime numbers

import java.util.*;

public class PalPrime
{
    // method to check if number is prime
    public static boolean isPrime(int number)
    {
        int factorCount = 0;
        // loop to find number of factors of number
        for(int factor = 1; factor < number; factor++){
            if(number%factor == 0)
                factorCount += 1;
        }
        
        // condition to check if number is prime
        boolean returnVal = false;
        if(factorCount == 1)
            returnVal = true;
        return returnVal;
    }
    
    // method to generate 3 digit palprimes
    public static void threeDigit()
    {
        // loop to find and print 3 digit palprimes
        for(int middle = 1; middle<10; middle += 2){
            if(isPrime(middle)){
                int palprime = Integer.parseInt("1"+middle+"1");
                // condition to check if number is prime
                if(isPrime(palprime)){
                    System.out.println(palprime);
                }
            }
        }
    }
    
    // method to generate 5 digit palprimes
    public static void fiveDigit()
    {
        // loop to find and print 5 digit palprimes
        for(int middle = 11; middle < 100; middle+=11){
            for(int centre = 1; centre < 10; centre += 1){
                int palprime = Integer.parseInt("1"+  middle/10+ centre + middle%10 + "1");
                // condition to check if number is prime
                if(isPrime(palprime))
                    System.out.println(palprime);
            }
        }
    }
    
    public static void GenPalPrime(int n)
    {
        // condition to check number of digits entered
        if(n == 2)
            System.out.println("11");
        else if(n == 3)
            threeDigit();
        else
            fiveDigit();
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of palprime nos (i.e. no. of digits in palprime no.):");
        int width = sc.nextInt();
        if(width < 2 || width > 5 || width == 4)
            System.out.println("Enter valid length");
        else
            GenPalPrime(width);
    }
}

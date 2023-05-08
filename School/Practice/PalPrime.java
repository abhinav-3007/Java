// Abhinav Goyal
// 11A
// Program to generate palprime numbers

import java.util.*;

public class PalPrime
{
    public static int isPrime(int n)
    {
        int factorCount = 2;
        for(int factors = 2; factors<n; factors++){
            if(n%factors == 0)
                factorCount++;
        }
        int returnVal = (factorCount==2)?1:0;
        return returnVal;
    }
    
    public static void GenPalPrime(int n)
    {
        if(n>5 || n<2 || n == 4)
            System.out.println("Invalid Number");
        else{
            String palprime = "11";
            String check = palprime;
            String[] primeArr = new String[100];
            while(check.length() < n){
                int middle = palprime.length()/2;
                for(int prime = 0; prime<=9; prime++){
                    check = check.substring(middle) + prime + check.substring(middle, palprime.length());
                    int primetest = Integer.parseInt(check);
                    System.out.println(primetest);
                }
            }
        }
    }
}

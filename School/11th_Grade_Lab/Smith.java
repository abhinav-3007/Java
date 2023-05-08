
/**
 * Write a description of class Smith here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class Smith
{
    int number, factorSum, digitSum;
    
    public Smith(int input)
    {
        number = input;
        factorSum = 0;
        digitSum = 0;
    }
    
    public static boolean isPrime(int checkNumber)
    {
        int factorCount = 0;
        for(int factor = 1; factor <= checkNumber; factor++) {
            if(checkNumber%factor == 0)
                factorCount++;
        }
        if(factorCount == 2)
            return true;
        else
            return false;
    }
    
    public void primeSum()
    {
        int numCopy = number;
        for(int factor = numCopy-1; factor > 1; factor--) {
            if(numCopy%factor == 0 && isPrime(factor)) {
                numCopy /= factor;
                while(factor > 0){
                    factorSum += factor%10;
                    factor /= 10;
                }
                System.out.println(factor+"\t"+numCopy);
                factor = numCopy+1;
            }
        }
    }
    
    public void digitSum()
    {
        int numCopy = number;
        while(numCopy > 0) {
            digitSum += numCopy%10;
            numCopy /= 10;
        }
    }
    
    public void checkSmith()
    {
        if(factorSum == digitSum)
            System.out.println("Smith");
        else
            System.out.println("Not Smith");
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Smith obj = new Smith(sc.nextInt());
        obj.primeSum();
        obj.digitSum();
        obj.checkSmith();
    }
}

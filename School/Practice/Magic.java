// Abhinav Goyal
// 11A
// Program to check if number is magic

import java.util.*;

public class Magic
{
    int n;
    //Constructor
    public Magic()
    {
        n = 0;
    }

    // method to assign value to n
    public void getnum(int nn)
    {
        n = nn;
    }
    
    // method to find sum of digits of a number
    public static int sum_of_Digits(int number)
    {
        int tempNum = number, sum = 0;
        while(tempNum > 0){
            // loop to find sum of digits
            int digit = tempNum%10;
            sum += digit;
            tempNum /= 10;
        }
        return sum;
    }
    
    // method to check if number is magic
    public void ismagic()
    {
        int numSum = sum_of_Digits(n);
        while(numSum > 9){
            // loop to calculate eventual sum
            numSum = sum_of_Digits(numSum);
        }
        
        // checking if number is magic
        if(numSum == 1)
            System.out.println("Number is magic");
        else
            System.out.println("Number is not magic");
    }
    
    // main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        Magic object = new Magic();
        object.getnum(number);
        object.ismagic();
    }
}

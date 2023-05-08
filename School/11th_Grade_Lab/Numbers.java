// Abhinav Goyal
// 11A
// Program to check for and print armstrong numbers

import java.util.*;

public class Numbers
{
    long number;
   
    // constructor
    public Numbers(long num)
    {
        number = num;
    }
   
    // method to check if number is armstrong
    public boolean IsArmstrong()
    {
        long temp = number;
        long cubeSum = 0;
        // loop to find sum of cubes of digits of number
        while(temp>0){
            long digit = temp%10;
            cubeSum += Math.pow(digit, 3);
            temp /= 10;
        }
       
        boolean returnVal = false;
        if(cubeSum == number)
            returnVal = true;
        return returnVal;
    }
   
    // method to cehck if number is armstrong like
    public boolean IsArmstrongLike()
    {
        int length = Long.toString(number).length();
        long cubeSum = 0;
        long temp = number;
        // loop to find sum of cubes of thirds of the number
        while(temp>0){
            long digits = temp%(int)(Math.pow(10, length/3));
            cubeSum += Math.pow(digits, 3);
            temp /= (Math.pow(10, length/3));
        }
       
        boolean returnVal = false;
        if(cubeSum == number)
            returnVal = true;
        return returnVal;
    }
   
    // method to generate armstrong numbers
    public void genArmstrongNos()
    {
        System.out.println("Armstrong Numbers:");
        // loop to find armstrong numbers
        for(number = 100; number<1000; number++){
            if(IsArmstrong())
                System.out.println(number);
        }
    }
   
    // method to generate armstrong like numbers
    public void genArmstrongLikeNos()
    {
        int digitCount;
        System.out.println("Armstrong Like Numbers:");
        // loop to find armstrong like numbers
        for(number = 100000; number<1000000; number++){
            if(IsArmstrongLike())
                System.out.println(number);
        }
    }
   
    // main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        long input = sc.nextLong();
        Numbers object = new Numbers(input);
        if(object.IsArmstrong())
            System.out.println("Number is armstrong");
        else
            System.out.println("Number is not armstrong");
       
        if(object.IsArmstrongLike())
            System.out.println("Number is armstrong like");
        else
            System.out.println("Number is not armstrong like");
       
        object.genArmstrongNos();
        object.genArmstrongLikeNos();
    }
}
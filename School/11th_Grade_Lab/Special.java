// Abhinav Goyal
// 11A
// Program to check if number is special number

import java.util.*;

public class Special
{
    int number;
    // Constructor method
    public Special(int num)
    {
        number = num;
    }
    
    // function to check if number is special
    public void specialCheck()
    {
        int temp = number, sum = 0;
        while(temp>0){
            int digit = temp%10;
            int factorial = 1;
            for(int i = 1; i<=digit; i++)
                factorial *= i;
            sum += factorial;
            temp = temp/10;
        }
        if(sum == number)
            System.out.println("The number is special");
        else
            System.out.println("The number is not special");
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int inputnumber = sc.nextInt();
        Special object = new Special(inputnumber);
        object.specialCheck();
    }
}

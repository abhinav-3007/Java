// Abhinav Goyal
// 11A
// Program to check if number is triangular

import java.util.*;

public class Number
{
    int n;
    public void getnum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
    }
    
    // method to check if numbre is triangular
    public int check(int checknumber)
    {
        int sum = 0;
        int returnValue = 0;
        for(int i = 1; sum<=checknumber; i++){
            sum += i;
            if(sum == checknumber)
                returnValue = 1;
        }
        return returnValue;
    }
    
    // method to display if number is triangular
    public void dispnum()
    {
        int isTriangle = check(n);
        if(isTriangle == 1)
            System.out.println("Number is triangular");
        else
            System.out.println("Number is not triangular");
    }
    
    // main method
    public static void main()
    {
        Number object = new Number();
        object.getnum();
        object.dispnum();
    }
}

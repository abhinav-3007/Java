// Abhinav Goyal
//9D 18/8/2020
//Program to print inputted digit in words

import java.util.*;

public class Words
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int digit = sc.nextInt();
        String s;
        if(digit == 0){
            s = "zero";
        }else if(digit == 1){
            s = "one";
        }else if(digit == 2){
            s = "two";
        }else if(digit == 3){
            s = "three";
        }else if(digit == 4){
            s = "four";
        }else if(digit == 5){
            s = "five";
        }else if(digit == 6){
            s = "six";
        }else if(digit == 7){
            s = "seven";
        }else if(digit == 8){
            s = "eight";
        }else if(digit == 9){
            s = "nine";
        }else{
            s = "Enter a single positive digit";
        }
        System.out.println(s);
    }
}

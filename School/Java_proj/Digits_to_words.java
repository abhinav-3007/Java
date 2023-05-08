// Abhinav Goyal
//9D 25/8/2020
//Program to convert digit to words

import java.util.*;

public class Digits_to_words
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int d = sc.nextInt();
        String w;
        switch(d)
        {
            case 0:
            w = "Zero";
            break;
            case 1:
            w = "One";
            break;
            case 2:
            w = "Two";
            break;
            case 3:
            w = "Three";
            break;
            case 4:
            w = "Four";
            break;
            case 5:
            w = "Five";
            break;
            case 6:
            w = "Six";
            break;
            case 7:
            w = "Seven";
            break;
            case 8:
            w = "Eight";
            break;
            case 9:
            w = "Nine";
            break;
            default:
            w = "Enter a single digit from 0-9";
        }
        System.out.println(w);
    }
}
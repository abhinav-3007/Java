// Abhinav Goyal
//9D 25/8/2020
//Program to print inputted in words

import java.util.*;

public class Day
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the day");
        int num = sc.nextInt();
        String day;
        switch(num)
        {
            case 1:
            day = "Monday";
            break;
            case 2:
            day = "Tuesday";
            break;
            case 3:
            day = "Wednesday";
            break;
            case 4:
            day = "Thursday";
            break;
            case 5:
            day = "Friday";
            break;
            case 6:
            day = "Saturday";
            break;
            case 7:
            day = "Sunday";
            break;
            default:
            day = "Please enter a number from 1-7";
        }
        System.out.println(day);
    }
}
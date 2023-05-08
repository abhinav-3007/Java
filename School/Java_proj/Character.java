// Abhinav Goyal
//9D 18/8/2020
//Program to check whether a character is a digit or letter

import java.util.*;

public class Character
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        String s;
        if(ch>='0' && ch<='9'){
            s = "digit";
        }else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            s = "letter";
        }else{
            s = "Only enter a digit or letter";
        }
        System.out.println(s);
    }
}
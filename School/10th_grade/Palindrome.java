// Abhinav Goyal
// 10D
//Program to check if String is palindrome

import java.util.*;

public class Palindrome
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        String rev = "";
        for(int i = st.length()-1; i>=0; i--)
            rev = rev+st.charAt(i);
        if(rev.equals(st))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
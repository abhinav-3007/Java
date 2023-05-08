// Abhinav Goyal
// 10D 
//Program to print the ascii value of characters

import java.util.*;

public class Numeric
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        for(int i = 0; i<st.length(); i++){
            int ch = st.charAt(i);
            System.out.println(ch);
        }

    }
}
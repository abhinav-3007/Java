// Abhinav Goyal
// 10D 
//Program to print count of types of characters

import java.util.*;

public class CharCount
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        int up=0, low=0, sp=0;
        for(int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            if('a'<=ch && ch<='z')
                low++;
            else if('A'<=ch && ch<='Z')
                up++;
            else
                sp++;
        }
        System.out.println("Upper: "+up);
        System.out.println("Lower: "+low);
        System.out.println("Special characters: "+sp);
    }
}
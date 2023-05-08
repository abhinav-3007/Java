// 25-03-2022
// Program to capitalize first letter of each word and make the rest lowercase

import java.util.*;

public class Capitalize
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = " "+(sc.nextLine().toLowerCase().trim());
        for(int i = 1; i<st.length(); i++){
            char ch = st.charAt(i-1);
            if(ch == ' ')
                st = st.substring(0,i)+Character.toUpperCase(st.charAt(i))+ st.substring(i+1, st.length());
        }
        System.out.println(st.trim());
    }
}

// Abhinav Goyal
// 10D
//Program to print String in lowercase except first letter

import java.util.*;

public class Lower
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = " "+sc.nextLine();
        String st2 = "";
        for(int i = 1; i<st.length(); i++){
            char ch = st.charAt(i);
            if(st.charAt(i-1)!=' ')
                st2 = st2+Character.toLowerCase(ch);
            else
                st2 = st2+Character.toUpperCase(ch);
        }
        System.out.println(st2);
    }
}
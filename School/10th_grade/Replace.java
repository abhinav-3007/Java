// Abhinav Goyal
// 10D 
//Program to replace 'e' with '*'

import java.util.*;

public class Replace
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        String st2 = "";
        for(int i = 0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch == 'e')
                st2 = st2+"*";
            else
                st2 = st2+ch;
        }
        System.out.println(st2);
    }
}
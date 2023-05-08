// Abhinav Goyal
// 10D
//Program to change case of string

import java.util.*;

public class CaseChange
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        String st2 = "";
        for(int i = 0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch<='z' && ch>='a')
                st2 = st2+(char)(ch-32);
            else if(ch<='Z' && ch>='A')
                st2 = st2+(char)(ch+32);
            else
                st2 = st2+ch;
        }
        System.out.println(st2);
    }
}
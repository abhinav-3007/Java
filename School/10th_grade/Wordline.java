// Abhinav Goyal
// 10D 
//Program to print words separately

import java.util.*;

public class Wordline
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine().trim()+" ";
        String nst = "";
        for(int i = 0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch == ' '){
                System.out.println(nst);
                nst = "";
            }else
                nst = nst+ch;
        }
    }
}
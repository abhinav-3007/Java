// Abhinav Goyal
// 10D
// Program to count vowels

import java.util.*;

public class Vowels
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        int vow = 0;
        st = st.toLowerCase();
        for(int i = 0; i<st.length(); i++){
            char c = st.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vow++;
        }
        System.out.println(vow+" vowels");
    }
}

// Abhinav Goyal
// 10D 
//Program to print the consonants

import java.util.*;

public class Consonant
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        String st2 = st.toLowerCase();
        for(int i = 0; i<st.length(); i++){
            char ch = st2.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                System.out.println(st.charAt(i));
        }
    }
}
// Abhinav Goyal
// 10D 
//Program to print count of consonants

import java.util.*;

public class ConsonantCount
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine().toLowerCase();
        int c = 0;
        for(int i = 0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                c++;
        }
        System.out.println(c);

    }
}
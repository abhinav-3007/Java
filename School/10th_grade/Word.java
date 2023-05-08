// Abhinav Goyal
// 10D
//Program to print number of words

import java.util.*;

public class Word
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        st = st.trim()+" ";
        int word = 0;
        for(int i = 0; i<st.length(); i++){
            if(st.charAt(i) == ' ')
                word++;
        }
        System.out.println(word+" words");
    }
}

// Abhinav Goyal
// 10D
// Program to find freqency of a word

import java.util.*;

public class RevisionFrequency
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine().trim()+" ";
        System.out.println("Enter the word");
        String key = sc.next()+" ";
        int ct = 0;
        String word = "";
        for(int i = 0; i<st.length(); i++){
            word = word+st.charAt(i);
            System.out.println(word);
            if(st.charAt(i) == ' '){
                if(word.equals(key))
                    ct++;
                System.out.println(word+ct);
                word = "";
            }
        }
        System.out.println("The frequency is: "+ct);
    }
}

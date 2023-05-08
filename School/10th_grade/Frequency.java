// Abhinav Goyal
// 10D 
//Program to print frequency of word

import java.util.*;

public class Frequency
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        System.out.println("Enter the word");
        String key=sc.next();
        int ct=0;
        String sub="";
        for(int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch!=' ')
                sub = sub+ch;
                
            else{
                if(sub.equals(key))
                    ct++;
                sub="";
            }
            
        }
        System.out.println("The frequency is "+ct);
    }
}
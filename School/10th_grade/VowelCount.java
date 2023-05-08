// Abhinav Goyal
// 10D 
// Program to count individual vowels

import java.util.*;

public class VowelCount
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine().toLowerCase();
        int a=0,e=0,i=0,o=0,u=0;
        for(int j = 0; j<st.length(); j++){
            char ch = st.charAt(j);
            if(ch == 'a')
                a++;
            else if(ch == 'e')
                e++;
            else if(ch == 'i')
                i++;
            else if(ch == 'o')
                o++;
            else if(ch == 'u')
                u++;
        }
        System.out.println("Letter\tCount");
        System.out.println("a\t"+a);
        System.out.println("e\t"+e);
        System.out.println("i\t"+i);
        System.out.println("o\t"+o);
        System.out.println("u\t"+u);
    }
}
// Abhinav Goyal
// 10D
//Program to count spaces

import java.util.*;

public class Spaces
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        int spc = 0;
        for(int i=0; i<st.length(); i++){
            if(st.charAt(i) == ' ')
                spc++;
        }
        System.out.println(spc+" spaces");
    }
}

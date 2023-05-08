// Abhinav Goyal
// 10D 10/6/2021
//Program to print letters separately

import java.util.*;

public class Letters40
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        for(int i=0; i<st.length(); i++)
            System.out.println(st.charAt(i));
    }
}

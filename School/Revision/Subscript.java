// Abhinav Goyal
// 10D
// Program to print index of a given character

import java.util.*;

public class Subscript
{
    public int subscript()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        int index = -1;
        for(int i = 0; i<st.length(); i++){
            if(ch == st.charAt(i)){
                index = i;
                break;
            }
        }
        return index;
    }
    
    public static void main()
    {
        Subscript obj = new Subscript();
        int res = obj.subscript();
        System.out.println(res);
    }
}

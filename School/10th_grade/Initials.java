// Abhinav Goyal
// 10D
// Program to print initials of a name

import java.util.*;

public class Initials
{
   public static void main(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the full name");
       String st = sc.nextLine().trim().toUpperCase();
       String init = ""+st.charAt(0);
       for(int i = 1; i<st.length(); i++){
           if(st.charAt(i-1) == ' ' && st.charAt(i)!=' ')
               init = init+"."+st.charAt(i);
       }
       System.out.println(init);
   }
}

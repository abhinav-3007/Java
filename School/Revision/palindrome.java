import java.util.*;
public class palindrome
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        String rev = "";
        for(int i = st.length()-1; i>=0; i--)
            rev = rev+st.charAt(i);
        System.out.println(rev.equals(st));
    }
}

import java.util.*;

public class RevisionAscii
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.nextLine();
        for(int i = 0; i<st.length(); i++){
            int ch = st.charAt(i);
            System.out.println(ch);
        }
    }
}

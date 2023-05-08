import java.util.*;

public class ReverseSentence
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = sc.nextLine().trim()+" ";
        String rev = "";
        String word = "";
        for(int i = 0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch == ' '){
                word = word+ch;
                rev = word+rev;
                word = "";
            }else{
                word = word+ch;
            }
        }
        System.out.println(rev);
    }
}

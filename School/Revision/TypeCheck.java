import java.util.*;

public class TypeCheck
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if(('a'<=ch && ch<='z')||('A'<=ch && ch<='Z'))
            System.out.println("Letter");
        else if('0'<=ch && '9'>=ch)
            System.out.println("Digit");
        else
            System.out.println("Neither digit nor letter");
    }
}

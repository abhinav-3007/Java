// Abhinav Goyal
// 11A
// Program to change case of String and convert it to the next character

import java.util.*;

public class Stringop
{
    String txt;
    // Constructor
    public Stringop()
    {
        txt = "";
    }
    
    // method to accept the String
    public void readstring()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        txt = sc.nextLine();
    }
    
    // method to convert letter to other case
    public char caseconvert(int ascii, int caseId)
    {
        char changed = (char)ascii;
        // chacking if the given character is uppercase
        if(caseId == 0)
            changed = (char)(ascii+32);
        // checking if the given character is lowercase
        else if(caseId == 1)
            changed = (char)(ascii-32);
        return changed;
    }
    
    // method to compute the resultant String
    void circularcode()
    {
        String newString = "";
        for(int index = 0; index < txt.length(); index++){
            char ch = txt.charAt(index);
            if(65 <= ch && ch <= 90)
                ch = (char)(caseconvert(ch, 0) + 1);
            else if(97 <= ch && ch <= 122)
                ch = (char)(caseconvert(ch, 1) + 1);
            if(ch == 91 || ch == 123)
                ch = (char)(ch - 26);
            newString = newString + ch;
        }
        System.out.println(newString);
    }
    
    public static void main(String[] args)
    {
        Stringop object = new Stringop();
        object.readstring();
        object.circularcode();
    }
}

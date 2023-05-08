// Abhinav Goyal
// 11A
// Program to find longest word in string

import java.util.*;

public class MyString
{
    String[] str;
    int len;
    
    // Constructor
    public MyString()
    {
        str = new String[0];
        len = 0;
    }
    
    // method to find ASCII value
    public int code(int index)
    {
        String st = "";
        // loop to convert array to string
        for(int ind = 0; ind < len; ind++){
            st = st + str[ind];
        }
        int code = (int)(st.charAt(index));
        return code;
    }
    
    // method to input string and convert it to array
    public void readString()
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().trim() + " ";
        int strLen = st.length();
        String word = "";
        int arrIndex = 0;
        
        // loop to find length of array
        for(int index = 0; index < strLen; index++){
            if(st.charAt(index) == ' ')
                len++;
        }
        
        str = new String[len];
        // loop to split string into array
        for(int index = 0; index < strLen; index++){
            word = word + st.charAt(index);
            if(st.charAt(index) == ' '){
                str[arrIndex] = word;
                arrIndex++;
                word = "";
            }
        }
    }
    
    // method to find longest word in string
    public void word()
    {
        int maxInd = 0;
        // loop to find longest word
        for(int ind = 0; ind < len; ind++){
            if(str[ind].length() > str[maxInd].length())
                maxInd = ind;
        }
        
        System.out.println(str[maxInd]);
    }
    
    public static void main(String[] args)
    {
        MyString obj = new MyString();
        obj.readString();
        obj.word();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of character for which ASCII value is to be found");
        System.out.println(obj.code(sc.nextInt()));
    }
}

// Abhinav Goyal
// 11A
// Program to perform operations on string

import java.util.*;

public class StringFun
{
    String str;
    // constructor
    public StringFun()
    {
        str = "";
    }
    
    // method to input string
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sc.nextLine().trim() + " ";
    }
    
    // method to find number of words, number of vowels, and number of 
    // uppercase characters in the string
    public void words()
    {
        int vowCount = 0, upperCount = 0, wordCount = 0;
        for(int ind = 0; ind < str.length(); ind++){
            char ch = str.charAt(ind);
            if(ch == ' ')
                wordCount++;
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vowCount++;
            if(Character.isUpperCase(ch))
                upperCount++;
        }
        System.out.println("Number of words: "+wordCount);
        System.out.println("Number of vowels: "+vowCount);
        System.out.println("Number of uppercase characters: "+upperCount);
    }
    
    // method to find frequency of each character in the string
    public void frequency()
    {
        char[] charArr = new char[26];
        int[] freqArr = new int[26];
        int lastFilledLoc = -1;
        str = str.trim();
        // loop to find frequncy and add it to array
        for(int ind = 0; ind < str.length(); ind++){
            char ch = str.charAt(ind);
            boolean present = false;
            int arrInd;
            for(arrInd = 0; arrInd < 26; arrInd++){
                if(ch == charArr[arrInd]){
                    present = true;
                    freqArr[arrInd]++;
                    break;
                }
            }
            if(!present){
                lastFilledLoc++;
                charArr[lastFilledLoc] = ch;
                freqArr[lastFilledLoc] = 1;
            }
        }
        System.out.println("Character frequency:");
        // loop to print frequencies
        for(int ind = 0; ind < 26; ind++){
            if(freqArr[ind] != 0){
                if(charArr[ind] == ' ')
                    System.out.println("Space\t"+freqArr[ind]);
                else
                    System.out.println(charArr[ind]+"\t"+freqArr[ind]);
            }
        }
    }
    
    // main method
    public static void main(String[] args)
    {
        StringFun obj = new StringFun();
        obj.input();
        obj.words();
        obj.frequency();
    }
}
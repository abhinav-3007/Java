
/**
 * Write a description of class Paragraph here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;

public class Paragraph
{
    String paragraph, word;
    int sentences, wordCount;
    String[] words;
    int[] frequency;
    
    public Paragraph(int sentCount, String text)
    {
        sentences = sentCount;
        wordCount = 0;
        paragraph = text;
        word = "";
        words = new String[30];
        frequency = new int[30];
    }
    
    public void wordCount()
    {
        paragraph = paragraph.replace(".", "").replace("? ", " ").trim() + " ";
        int arrIndex = 0, currentWord = 0;
        boolean wordFound = false;
        for(int index = 0; index < paragraph.length(); index++) {
            char ch = paragraph.charAt(index);
            if(ch == ' '){
                wordCount++;
                arrIndex = 0;
                wordFound = false;
                while(words[arrIndex] != null) {
                    if(word.equals(words[arrIndex])){
                        frequency[arrIndex]++;
                        wordFound = true;
                        break;
                    }
                }
                if(!wordFound) {
                    words[currentWord] = word;
                    frequency[currentWord] = 1;
                    currentWord++;
                }
                word = "";
            } else
                word = word + ch;
        }
    }
    
    public void dispFrequency()
    {
        System.out.println("Words:" + wordCount);
        
        for(int outer = 0; outer < 30; outer++) {
            int small = outer;
            if(words[small] != null) {
                for(int inner = outer+1; inner < 30; inner++) {
                    if(frequency[inner] < frequency[small]){
                        small = inner;
                    }
                }
                String temp = words[small];
                words[small] = words[outer];
                words[outer] = temp;
                
                int tmp = frequency[small];
                frequency[small] = frequency[outer];
                frequency[outer] = tmp;
            }
        }
        
        int index = 0;
        while(words[index] != null) {
            System.out.println(words[index]+"\t"+frequency[index]);
            index++;
        }
    }
    
    public static void main() throws IOException
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of sentences");
        int sent = Integer.parseInt(sc.readLine());
        System.out.println("Enter paragraph:");
        String para = sc.readLine();
        
        Paragraph obj = new Paragraph(sent, para);
        obj.wordCount();
        obj.dispFrequency();
    }
}


/**
 * Write a description of class Scores here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class Scores
{
    char[][] answers;
    char[] answerKey;
    int[] scores;
    int participants;
    public Scores()
    {
        participants = 0;
        answerKey = new char[5];
        answers = new char[0][0];
        scores = new int[0];
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        participants = sc.nextInt();
        if(participants > 3 && participants < 11) {
            answers = new char[participants][5];
            scores = new int[participants];
            for(int i = 0; i < participants; i++) {
                for(int j = 0; j<5; j++)
                    answers[i][j] = sc.next().charAt(0);
            }
            
            for(int i = 0; i<5; i++)
                answerKey[i] = sc.next().charAt(0);
            calc();
        } else
            System.out.println("Invalid Input");
    }
    
    public void calc()
    {
        int score = 0;
        for(int i = 0; i<participants; i++) {
            for(int j = 0; j<5; j++) {
                if(answers[i][j] == answerKey[j]) {
                    score++;
                }
            }
            scores[i] = score;
            score = 0;
        }
        disp();
    }
    
    public void disp()
    {
        int high = 0;
        for(int i = 0; i<participants; i++) {
            if(scores[i] > high)
                high = scores[i];
        }
        
        for(int i = 0; i<participants; i++) {
            System.out.println((i+1)+"\t"+scores[i]);
        }
        
        System.out.println("High scores:");
        for(int i = 0; i<participants; i++) {
            if(scores[i] == high)
                System.out.println(i+1);
        }
    }
    
    public static void main()
    {
        Scores obj = new Scores();
        obj.input();
    }
}

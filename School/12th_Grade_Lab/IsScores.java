// Abhinav Goyal
// 12 A
// Class to calculate total points in subjects
import java.util.*;

public class IsScores
{
    int number[][];
    
    // Constructor to input marks
    public IsScores()
    {
        Scanner sc = new Scanner(System.in);
        number = new int[6][2];
        System.out.println("Enter subject code followed by marks");
        //loop to take input
        for(int index = 0; index < 6; index++) {
            System.out.print("Subject code: ");
            number[index][0] = sc.nextInt();
            System.out.print("Marks: ");
            number[index][1] = sc.nextInt();
        }
    }
    
    // method to find points in each subject
    public int point()
    {
        int sum = 0;
        for(int row = 0; row<6; row++) {
            if(number[row][1] >= 90)
                sum+=1;
            else if(number[row][1] >= 80)
                sum+=2;
            else if(number[row][1] >= 70)
                sum+=3;
            else if(number[row][1] >= 60)
                sum+=4;
            else if(number[row][1] >= 50)
                sum+=5;
            else if(number[row][1] >= 40)
                sum+=6;
        }
        return sum;
    }
}

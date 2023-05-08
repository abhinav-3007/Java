// Abhinav Goyal
// 10D
// Program to print grade of student

import java.util.*;

public class GradeArray
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int mks[][] = new int[10][3];
        for(int i = 0; i<10; i++){
            System.out.println("Enter the student's marks one by one");
            mks[i][0] = sc.nextInt();
            mks[i][1] = sc.nextInt();
            mks[i][2] = sc.nextInt();
        }
        double avg = 0;
        for(int i = 0; i<10; i++){
            for(int j = 0; j<3; j++)
                avg+=mks[i][j];
            avg/=3;
            if(avg>75.0)
                System.out.println("A");
            else if(avg>60.0)
                System.out.println("B");
            else if(avg>45.0)
                System.out.println("C");
            else
                System.out.println("D");
        }
    }
}

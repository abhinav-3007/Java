// Abhinav Goyal
// 10  22/2/2021
// Program to find maximum marks scored

import java.util.*;

public class RollArray
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int roll[] = new int[6];
        int mks[] = new int[6];
        for(int i=0; i<6; i++){
            System.out.println("Enter the roll no.");
            roll[i] = sc.nextInt();
            System.out.println("Enter the marks");
            mks[i] = sc.nextInt();
        }
        int ind = 0;
        for(int i=1; i<6; i++){
            if(mks[i]>mks[ind])
                ind = i;
        }
        System.out.println("The maximum marks were: "+mks[ind]);
        System.out.println("And they were scored by roll no: "+roll[ind]);
    }
}
